import java.io.*;
public class PipedCommunication {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        Thread sender = new Thread(() -> {
            try { pos.write("Hello Thread".getBytes()); pos.close(); }
            catch(IOException e){ e.printStackTrace(); }
        });
        Thread receiver = new Thread(() -> {
            try { int data; while((data = pis.read()) != -1) System.out.print((char)data); pis.close(); }
            catch(IOException e){ e.printStackTrace(); }
        });
        sender.start(); receiver.start();
    }
}