public class ThreadExtendExample extends Thread {
    private String name;
    public ThreadExtendExample(String name){ this.name = name; }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name + " - count: " + i);
            try{ Thread.sleep(200); } catch(InterruptedException e){ }
        }
    }
    public static void main(String[] args){
        new ThreadExtendExample("ExtThread-1").start();
    }
}