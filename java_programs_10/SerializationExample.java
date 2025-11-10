import java.io.*;
class Person implements Serializable {
    String name; int age;
    Person(String n, int a){ name=n; age=a; }
}
public class SerializationExample {
    public static void main(String[] args) throws Exception {
        Person p = new Person("John", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p); oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p2 = (Person) ois.readObject();
        System.out.println(p2.name + " " + p2.age);
        ois.close();
    }
}