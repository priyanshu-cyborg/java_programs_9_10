import java.io.*;
public class ReadUntilExit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Type lines (type 'exit' to stop):");
        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
            System.out.println("You typed: " + line);
        }
    }
}