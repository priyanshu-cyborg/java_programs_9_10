import java.util.*; public class WildcardDemo{
    public static void printAny(List<?> list){ for(Object o:list) System.out.print(o+" "); System.out.println(); }
    public static double sumNums(List<? extends Number> nums){ double s=0; for(Number n:nums) s+=n.doubleValue(); return s; }
    public static void addInts(List<? super Integer> list){ list.add(1); list.add(2); }
    public static void main(String[] args){ List<String> s=Arrays.asList("a","b"); printAny(s); List<Integer> i=Arrays.asList(1,2,3); System.out.println(sumNums(i)); List<Number> n=new ArrayList<>(); addInts(n); printAny(n); }
}