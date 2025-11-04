public class CurrentThreadInfo{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Current thread name: " + t.getName());
        System.out.println("Current thread priority: " + t.getPriority());
    }
}