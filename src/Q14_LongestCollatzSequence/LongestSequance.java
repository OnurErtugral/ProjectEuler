package Q14_LongestCollatzSequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Onur Ertugral on 30.07.2017.
 * This program finds the number Which is under one million and  produces the longest Collatz chain?
 */
public class LongestSequance {
    public static void main(String[] args) {
        int max = 2;
        int[] chain = new int[1000000];
        for (int i = 3; i < 1000000; i++) {
            long n = i;
            int sequance = 1;
            System.out.printf("%d: %d ", i, n);

            while (n > 1) {
                if (n % 2 == 0) {
                    sequance++;
                    n = n / 2;
                    System.out.printf("%d ", n);
                    continue;
                } else {
                    sequance++;
                    n = 3 * n + 1;
                    System.out.printf("%d ", n);
                    continue;
                }
            }
            chain[i] = sequance;
            if (sequance > max)
                max = sequance;
        }
        System.out.println("Max sequance: " + max);

        for (int i = 3; i < 1000000; i++) {
            if (chain[i] == max)
                System.out.printf("The number: %d", i);
        }
    }
}
