package Q10_SummationOfPrimes;

/**
 * Created by Onur Ertugral on 29.07.2017.
 * This program finds the sum of all the primes below two million.
 */
public class SummationOfPrimes {
    public static void main(String[] args) {
        int n = 2000000;
        long sum = 0;

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n ; i++) {
            if (isPrime[i]) {
                for (int j = i; j * i <= n ; j++) {
                    isPrime[j * i] = false;
                }
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i])
                sum += i;
        }
        System.out.println(sum);
    }


}
