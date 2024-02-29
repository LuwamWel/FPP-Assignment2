import java.util.Arrays;

/* For example, if the input array is
["horse", "dog", "cat", "horse", dog"]
then the output would be the following array:
["horse","dog","cat"]
 */
public class Prog3 {
    public static void main(String[] args) {
        String [] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(removeDups(inputArray)));
    }
    public static String[] removeDups(String[] arr) {
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean dupFound = false;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    dupFound = true;
                    break;
                }
            }
            if (!dupFound) {
                arr[lastIndex++] = arr[i];
            }
        }
        String[] newArr = Arrays.copyOf(arr, lastIndex);
        return newArr;
    }
}
