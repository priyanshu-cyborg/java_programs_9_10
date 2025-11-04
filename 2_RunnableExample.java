class RunnableExample implements Runnable{
    private String name;
    public RunnableExample(String name){ this.name = name; }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name + " -> " + i);
            try{ Thread.sleep(150); } catch(InterruptedException e){}
        }
    }
    public static void main(String[] args){
        new Thread(new RunnableExample("Runnable-1")).start();
    }
}