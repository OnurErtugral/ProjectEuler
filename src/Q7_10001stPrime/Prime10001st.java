/**
 * Created by Onur Ertugral on 25.07.2017.
 * This program finds the 10001st prime number?
 */
public class Prime10001st {
    public static void main(String[] args) {
        int n = 1000000000;
        //Sieve of Eratosthenes Algorithm
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i < n ; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= n ; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                System.out.println(count + ".: " + i);
            }
            if (count >=10001)
                System.exit(0);
        }
    }

}
