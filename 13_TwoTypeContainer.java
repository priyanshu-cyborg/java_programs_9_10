public class TwoTypeContainer<K,V>{
    private K first; private V second;
    public TwoTypeContainer(K f,V s){first=f;second=s;}
    public K getFirst(){return first;} public V getSecond(){return second;}
    public static void main(String[] args){ TwoTypeContainer<String,Integer> t=new TwoTypeContainer<>("Age",21); System.out.println(t.getFirst()+" "+t.getSecond()); }
}