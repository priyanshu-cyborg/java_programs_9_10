import java.util.LinkedList; import java.util.Queue;
public class ProducerConsumerWaitNotify{
    static class Drop{
        private final Queue<Integer> q = new LinkedList<>(); private final int LIMIT = 5;
        public synchronized void put(int v) throws InterruptedException{
            while(q.size() == LIMIT) wait(); q.add(v);
            System.out.println("Produced: " + v); notifyAll();
        }
        public synchronized int take() throws InterruptedException{
            while(q.isEmpty()) wait(); int v = q.poll();
            System.out.println("Consumed: " + v); notifyAll(); return v;
        }
    }
    public static void main(String[] args){
        Drop drop = new Drop();
        Thread producer = new Thread(() -> { for(int i=1;i<=10;i++) try{ drop.put(i); Thread.sleep(100);}catch(Exception e){} });
        Thread consumer = new Thread(() -> { for(int i=1;i<=10;i++) try{ drop.take(); Thread.sleep(200);}catch(Exception e){} });
        producer.start(); consumer.start();
    }
}