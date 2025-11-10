import java.io.*;
public class GenericSerializer<T extends Serializable> {
    public void save(T obj, String file) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(obj);
        }
    }
    public T load(String file) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            return (T) ois.readObject();
        }
    }
    public static void main(String[] args) throws Exception {
        GenericSerializer<String> gs = new GenericSerializer<>();
        gs.save("Hello", "string.ser");
        System.out.println(gs.load("string.ser"));
    }
}