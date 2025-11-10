import java.io.*;
public class WriteUntilStop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("user_input.txt"));
        String line;
        System.out.println("Enter lines (type 'stop' to end):");
        while (!(line = br.readLine()).equalsIgnoreCase("stop")) {
            bw.write(line); bw.newLine();
        }
        bw.close(); br.close();
        System.out.println("Data saved to user_input.txt");
    }
}