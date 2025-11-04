public class SleepExample{
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread will sleep for 2 seconds now...");
            try{ Thread.sleep(2000); }catch(InterruptedException e){ System.out.println("Interrupted"); }
            System.out.println("Thread woke up after sleep.");
        });
        t.start();
    }
}