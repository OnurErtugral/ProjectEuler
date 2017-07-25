package Q4_LargestPalindromeProduct;

/**
 * Created by Onur Ertugral on 25.07.2017.
 * Thşs program finds the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPolindromeProduct {
    public static void main(String[] args) {
        int maxPalindrome = -1;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (isPolindrome(i * j))
                    if (i * j > maxPalindrome)
                        maxPalindrome = i * j;
            }
        }
        System.out.println(maxPalindrome);
    }

    public static boolean isPolindrome(int number) {
        String temp = Integer.toString(number);
        int low = 0;
        int high = temp.length() - 1;

        while (low < high) {
            if (temp.charAt(low) != temp.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
