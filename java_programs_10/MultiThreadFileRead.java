import java.io.*;
public class MultiThreadFileRead {
    static class FileReaderThread extends Thread {
        private String file;
        FileReaderThread(String f){ this.file = f; }
        public void run(){
            try(BufferedReader br = new BufferedReader(new FileReader(file))){
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(getName() + " reading: " + line);
                }
            }catch(IOException e){ e.printStackTrace(); }
        }
    }
    public static void main(String[] args){
        new FileReaderThread("f1.txt").start();
        new FileReaderThread("f2.txt").start();
    }
}