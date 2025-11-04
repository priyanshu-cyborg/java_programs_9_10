public class ArrayPrinter{
    public static <T> void printArray(T[] arr){ for(T e:arr) System.out.print(e+" "); System.out.println(); }
    public static void main(String[] args){ String[] s={"a","b","c"}; printArray(s); }
}