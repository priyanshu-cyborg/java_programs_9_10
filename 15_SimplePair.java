public class SimplePair<A,B>{
    private A first; private B second;
    public SimplePair(A f,B s){first=f;second=s;}
    public A getFirst(){return first;} public B getSecond(){return second;}
    public static void main(String[] args){ SimplePair<String,Integer> p=new SimplePair<>("x",10); System.out.println(p.getFirst()+":"+p.getSecond()); }
}