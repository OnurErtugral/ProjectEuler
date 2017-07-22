package Q3_LargestPrimeDivisor;


/**
 * Created by onur on 14.07.2017.
 */
public class LargestPrime {
    public static void main(String[] args) {
        long x = 10098983456L;
        int count = 1;
        boolean isPrime = true;

        for (long i = 2; i < x/2; i++) {
            if (x % i == 0) {
                System.out.printf("%s ", i);
                for (int j = 2; j < i/2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.printf("%d. Prime", count);
                    ++count;
                }
            System.out.println();
            }
        }
        System.out.println("Done!");
    }
}
