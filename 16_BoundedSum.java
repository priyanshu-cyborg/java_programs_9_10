public class BoundedSum{
    public static <T extends Number> double sum(T[] nums){ double s=0; for(T n:nums) s+=n.doubleValue(); return s; }
    public static void main(String[] args){ Integer[] a={1,2,3}; System.out.println(sum(a)); }
}