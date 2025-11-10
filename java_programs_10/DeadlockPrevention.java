import java.util.concurrent.locks.ReentrantLock;
public class DeadlockPrevention {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();
    public static void main(String[] args){
        Runnable task1 = () -> {
            lock1.lock(); lock2.lock();
            System.out.println("Task1 completed");
            lock2.unlock(); lock1.unlock();
        };
        Runnable task2 = () -> {
            lock1.lock(); lock2.lock();
            System.out.println("Task2 completed");
            lock2.unlock(); lock1.unlock();
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}