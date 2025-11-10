public class MultiThreadDownloader {
    static class Downloader extends Thread {
        private int part;
        Downloader(int part){ this.part = part; }
        public void run(){
            System.out.println("Downloading chunk " + part + "...");
            try{ Thread.sleep(500); }catch(InterruptedException e){}
            System.out.println("Chunk " + part + " downloaded.");
        }
    }
    public static void main(String[] args){
        for(int i=1;i<=3;i++) new Downloader(i).start();
    }
}