package Q3_LargestPrimeDivisor;


import java.util.ArrayList;

/**
 * Created by onur on 14.07.2017.
 */
public class LargestPrime {
    public static void main(String[] args) {
        long x = 1000000000L;
        long max =-1;
        long target = 600851475143L;

        boolean[] isPrime = new boolean[(int)(x+1)];
        for (int i = 2; i <= x; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor*factor <= x; factor++) {

            if (isPrime[factor]) {
                for (int j = factor; factor*j <= x; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        for (long i = x / 2; i >= 3 ; i--) {
            if (isPrime[(int) i] && target % i == 0) {
                max = i;
                break;
            }
        }
        System.out.println("Max prime divisor: " + max);
    }

}
