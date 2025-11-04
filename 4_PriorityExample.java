public class PriorityExample{
    static class PThread extends Thread{
        private String id;
        public PThread(String id){ this.id = id; }
        @Override
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println(id + " (priority=" + getPriority() + ") -> " + i);
                try{ Thread.sleep(100); } catch(InterruptedException e){}
            }
        }
    }
    public static void main(String[] args){
        PThread t1 = new PThread("T-low");
        PThread t2 = new PThread("T-normal");
        PThread t3 = new PThread("T-high");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start(); t2.start(); t3.start();
    }
}