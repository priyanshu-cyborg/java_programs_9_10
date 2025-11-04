public class BankAccountSync{
    static class BankAccount{
        private int balance;
        public BankAccount(int b){ balance = b; }
        public synchronized boolean withdraw(int amount){
            System.out.println(Thread.currentThread().getName()+" trying to withdraw " + amount);
            if(balance >= amount){
                try{ Thread.sleep(100); } catch(InterruptedException e){}
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+" successful, remaining: " + balance);
                return true;
            }else{
                System.out.println(Thread.currentThread().getName()+" failed, insufficient funds (balance="+balance+")");
                return false;
            }
        }
    }
    public static void main(String[] args){
        BankAccount acc = new BankAccount(100);
        Runnable r = () -> { for(int i=0;i<3;i++) acc.withdraw(50); };
        new Thread(r, "Withdraw-1").start();
        new Thread(r, "Withdraw-2").start();
    }
}