package Q25_1000DigitFibonacciNumber;

import java.math.BigInteger;

/**
 * Created by Onur Ertugral on 05.08.2017.
 * This program finds the index of the first term in the Fibonacci sequence to contain 1000 digits.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        BigInteger fn = new BigInteger("0");
        BigInteger fn_1 = new BigInteger("1");
        BigInteger fn_2 = new BigInteger("1");
        boolean loopCondition = true;
        int index = 2;

        while (loopCondition) {
            index++;
            fn = fn_1.add(fn_2);
            System.out.printf("F%d: %s\n", index, fn);

            if (String.valueOf(fn).length() >= 1000) {
                System.out.println("Index: " + index);
                loopCondition = false;
            } else {
                fn_2 = fn_1;
                fn_1 = fn;
            }
        }
    }
}
