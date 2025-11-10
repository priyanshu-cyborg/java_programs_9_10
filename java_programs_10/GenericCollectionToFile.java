import java.io.*;
import java.util.*;
public class GenericCollectionToFile<T> {
    private List<T> list = new ArrayList<>();
    public void add(T item){ list.add(item); }
    public void writeToFile(String filename) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            for(T item : list) bw.write(item.toString() + "\n");
        }
    }
    public static void main(String[] args) throws IOException {
        GenericCollectionToFile<Integer> g = new GenericCollectionToFile<>();
        g.add(10); g.add(20); g.writeToFile("ints.txt");
        System.out.println("Integers written.");
    }
}