import java.util.*;
public class AtomicCounterSync{
    static class Counter{
        private int count=0; public synchronized void increment(){count++;}
        public synchronized int get(){return count;}
    }
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<10;i++){ Thread t=new Thread(() -> { for(int j=0;j<1000;j++) c.increment(); }); threads.add(t); t.start(); }
        for(Thread t: threads) t.join();
        System.out.println("Final count: "+c.get());
    }
}