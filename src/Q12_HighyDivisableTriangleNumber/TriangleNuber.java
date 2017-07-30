package Q12_HighyDivisableTriangleNumber;

/**
 * Created by Onur Ertugral on 30.07.2017.
 * This program finds the value of the first triangle number to have over five hundred divisors.
 */
public class TriangleNuber {
    public static void main(String[] args) {
        int count = 0;
        for (long i = 1;  ; i++) {
            long number = (i * (i + 1)) / 2;
            System.out.printf("Number %d: ", number);

            if (number % 2 == 0) {
                for (int j = 1; j <= number / 2; j++) {
                    if (number % j == 0) {
                        count++;
                    }
                    if (count > 500) {
                        System.out.printf("%d ", number);
                        System.exit(0);
                    }
                }
                System.out.printf(" Divisor: %d\n", count + 1);
                count = 0;
            } else {
                for (int j = 1; j <= number / 2; j = j * 2 + 1) {
                    if (number % j == 0) {
                        count++;
                    }
                    if (count > 500) {
                        System.out.printf("%d ", number);
                        System.exit(0);
                    }
                }
                System.out.printf(" Divisor: %d\n", count + 1);
                count = 0;
            }
        }
    }
}
