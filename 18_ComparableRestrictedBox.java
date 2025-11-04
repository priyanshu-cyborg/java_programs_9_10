public class ComparableRestrictedBox<T extends Comparable<T>>{
    private T value; public ComparableRestrictedBox(T v){value=v;}
    public boolean isGreaterThan(T other){return value.compareTo(other)>0;}
    public static void main(String[] args){ ComparableRestrictedBox<Integer> b=new ComparableRestrictedBox<>(10); System.out.println(b.isGreaterThan(5)); }
}