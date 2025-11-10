import java.io.*;
public class WriteFileCharStream {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Writing data to file using FileWriter.");
        fw.close();
        System.out.println("Data written successfully.");
    }
}