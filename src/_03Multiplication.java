/**
 * Class to show multiplication
 */

public class _03Multiplication {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 10;
        float f1 = 15.5f;
        double d1 = 20.5;

        int res1 = i1 * i2; // 50
        float res2 = i1 * f1; // 77.5
        double res3 = i2 * d1; // 205.5

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);

        byte b1 = 20;
        byte b2 = 2;

        byte result = (byte) (b1 * b2); // Casting is required
        System.out.println("res4 = " + result);

        // i1 = 1_000_000; -  re-assignment
        // i2 = 5000; - re-assignment

        // res1 = i1 * i2; result is out of int range, but compiler tries to fit the value. it comes out to be a whole different expected since the i1 and i2 were both int types... which does not hold the scope of the values given.
    }
}
