import java.util.*; public class CountGreater{
    public static <T extends Comparable<T>> int countGreaterThan(List<T> list,T elem){int c=0;for(T t:list)if(t.compareTo(elem)>0)c++;return c;}
    public static void main(String[] args){ List<Integer> l=Arrays.asList(1,4,6,2,9); System.out.println(countGreaterThan(l,4)); }
}