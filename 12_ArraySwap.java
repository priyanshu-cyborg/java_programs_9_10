public class ArraySwap{
    public static <T> void swap(T[] arr, int i, int j){ T tmp=arr[i]; arr[i]=arr[j]; arr[j]=tmp; }
    public static void main(String[] args){
        Integer[] a={1,2,3}; swap(a,0,2);
        System.out.println(java.util.Arrays.toString(a));
    }
}