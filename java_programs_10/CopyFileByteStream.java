import java.io.*;
public class CopyFileByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        int b;
        while ((b = fis.read()) != -1) fos.write(b);
        fis.close(); fos.close();
        System.out.println("File copied successfully.");
    }
}