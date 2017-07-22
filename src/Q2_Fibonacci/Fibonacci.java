package Q2_Fibonacci;

/**
 * Created by onur on 14.07.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int sum = 2;
        int f1 = 1;
        int f2 = 2;
        int f3 = f1 + f2;
        while (f3 < 4000000) {
            if (f3 % 2 == 0) {
                sum += f3;
            }
                f1 = f2;
                f2 = f3;
            f3 = f1 + f2;
        }
        System.out.println("Total: " + sum);
    }
}
