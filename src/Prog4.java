public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;
//    1. the sum of the floats as an integer, obtained by casting the sum to type int
//    2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the
//    Math.round function

        int sum = (int)(a + b + c);
        System.out.println(sum);

        int sum2 = (int)Math.round(a + b + c);
        System.out.println(sum2);
    }

}
