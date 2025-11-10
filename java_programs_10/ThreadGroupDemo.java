public class ThreadGroupDemo {
    public static void main(String[] args){
        ThreadGroup group = new ThreadGroup("MyGroup");
        Runnable r = () -> { try{ Thread.sleep(1000); }catch(InterruptedException e){} };
        Thread t1 = new Thread(group, r, "T1");
        Thread t2 = new Thread(group, r, "T2");
        t1.start(); t2.start();
        group.list();
    }
}