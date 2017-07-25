/**
 * Created by Onur Ertugral on 25.07.2017.
 * This program finds the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        for (int i = 2; ; i++) {
            if (isDiviseable(i)) {
                System.out.println(i);
                System.exit(0);
            }
        }
   }

    public static boolean isDiviseable(int number) {
        for (int i = 2; i <= 20 ; i++) {
            if (number % i != 0)
                return false;
        }
        return true;
    }
}
