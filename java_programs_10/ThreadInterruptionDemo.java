public class ThreadInterruptionDemo {
    public static void main(String[] args){
        Thread t = new Thread(() -> {
            try{
                for(int i=0;i<10;i++){
                    System.out.println("Working " + i);
                    Thread.sleep(300);
                }
            }catch(InterruptedException e){
                System.out.println("Thread interrupted!");
            }
        });
        t.start();
        try{ Thread.sleep(1000); }catch(InterruptedException e){}
        t.interrupt();
    }
}