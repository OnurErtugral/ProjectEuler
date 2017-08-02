package Q21_AmicableNumbers;

/**
 * Created by Onur Ertugral on 02.08.2017.
 * This program evaluates the sum of all the amicable numbers under 10000.
 */
public class AmicableNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            int a = sumOfDivisor(i);
            if (i != a) {
                int b = sumOfDivisor(a);
                if (i == b) {
                    System.out.println("Amicable number: " + i);
                    sum += i;
                }
            }
        }
        System.out.println("Sum of amicable numbers: " + sum);
    }

    private static int sumOfDivisor(int i) {
        int sum = 0;

        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
