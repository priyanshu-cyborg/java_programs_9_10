import java.io.*;
public class WriteStringConsole {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write("Hello from OutputStreamWriter!\n");
        osw.flush();
    }
}