public class DeadlockDemo{
    private static final Object LOCK_A = new Object();
    private static final Object LOCK_B = new Object();
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            synchronized(LOCK_A){
                System.out.println("T1 acquired A");
                try{ Thread.sleep(100); } catch(InterruptedException e){}
                synchronized(LOCK_B){ System.out.println("T1 acquired B"); }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(LOCK_B){
                System.out.println("T2 acquired B");
                try{ Thread.sleep(100); } catch(InterruptedException e){}
                synchronized(LOCK_A){ System.out.println("T2 acquired A"); }
            }
        });
        t1.start(); t2.start();
    }
}