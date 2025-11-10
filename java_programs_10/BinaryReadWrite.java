import java.io.*;
public class BinaryReadWrite {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeInt(42);
            dos.writeUTF("Hello Binary");
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        }
    }
}