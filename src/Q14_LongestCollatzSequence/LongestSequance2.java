package Q14_LongestCollatzSequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Onur Ertugral on 30.07.2017.
 * This program finds the number Which is under one million and  produces the longest Collatz chain?
 */
public class LongestSequance2 {
    public static void main(String[] args) {
        int max = 2;
        int number = 1000000;
        int[] chain = new int[number];
        Map<Long, Long> hashMap = new HashMap<>();

        for (int i = 3; i < number; i++) {
            long n = i;
            int sequance = 1;
            System.out.printf("%d: %d ", i, n);
            while (n > 1) {
                if (n % 2 == 0) {
                    sequance++;
                    n = n / 2;
                    if (hashMap.containsKey(n)) {
                        sequance += hashMap.get(n);
                        break;
                    }
                    System.out.printf("%d ", n);
                    continue;
                } else {
                    sequance++;
                    n = 3 * n + 1;
                    if (hashMap.containsKey(n)) {
                        sequance += hashMap.get(n);
                        break;
                    }
                    System.out.printf("%d ", n);
                    continue;
                }
            }
            System.out.printf("|sequance= %d", sequance);
            if (!hashMap.containsKey(i)) {
                hashMap.put((long)i, (long)(sequance - 1));
            }
            System.out.printf("\n");
            chain[i] = sequance;
            if (sequance > max)
                max = sequance;
        }
        System.out.println("Max sequance: " + max);

        for (int i = 3; i < number; i++) {
            if (chain[i] == max)
                System.out.printf("The number: %d", i);
        }
    }
}
