package Q20_FactorialDigitSum;

import java.math.BigInteger;

/**
 * Created by Onur Ertugral on 02.08.2017.
 * This program finds the sum of the digits in the number 100!
 */
public class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.printf("%d: %s\n", i, factorial);
        }

        String factorial100 = factorial.toString();
        int sum = 0;
        for (int i = 0; i < factorial100.length(); i++) {
            sum += Integer.parseInt(Character.toString(factorial100.charAt(i)));
        }
        System.out.println(sum);
    }
}
