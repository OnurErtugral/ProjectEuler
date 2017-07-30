package Q16_PowerSumProduct;

import java.math.BigInteger;

/**
 * Created by Onur Ertugral on 30.07.2017.
 * This program finds the sum of the digits of the number 2^1000
 */
public class PowerSumProduct {
    public static void main(String[] args) {
        BigInteger product = new BigInteger(String.valueOf(1));
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            product = product.multiply(BigInteger.valueOf(2));
        }
        String temp = product.toString();
        for (int i = 0; i < temp.length(); i++) {
            sum += Integer.valueOf(Character.toString(temp.charAt(i)));
        }
        System.out.println(sum);
    }
}
