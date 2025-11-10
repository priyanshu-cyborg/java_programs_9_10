import java.io.*;
public class SynchronizedLogWriter {
    static class Logger {
        public synchronized void log(String msg){
            try(FileWriter fw = new FileWriter("log.txt", true)){
                fw.write(Thread.currentThread().getName() + ": " + msg + "\n");
            } catch(IOException e){ e.printStackTrace(); }
        }
    }
    public static void main(String[] args){
        Logger logger = new Logger();
        Runnable r = () -> { for(int i=0;i<3;i++) logger.log("Message " + i); };
        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}