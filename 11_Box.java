public class Box<T>{
    private T value;
    public Box(T v){ this.value=v; }
    public void set(T v){ this.value=v; }
    public T get(){ return value; }
    public static void main(String[] args){ Box<String> b=new Box<>("Hello"); System.out.println(b.get()); }
}