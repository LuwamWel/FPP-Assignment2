import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int [] arr1 = {5,6,-4,3,1};
        int [] arr2 = {3,8,9,11};
        System.out.println(Arrays.toString(combine(arr1, arr2)));
    }
    public static int[] combine(int[] a, int[] b){

        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
