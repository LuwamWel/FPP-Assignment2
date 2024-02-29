public class Prog1 {
    public static void main(String[] args) {
        // 1. get a random number x in the range 1 .. 9 and compute π to the power of x
        int x = RandomNumbers.getRandomInt(1,9);
        System.out.println(Math.pow(Math.PI, x));

        //2. get a random number y in the range 3 .. 14 and compute y to the power of π
        int y = RandomNumbers.getRandomInt(3,14);
        System.out.println(Math.pow(y, Math.PI));
    }
}
