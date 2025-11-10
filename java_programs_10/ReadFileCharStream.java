import java.io.*;
public class ReadFileCharStream {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}