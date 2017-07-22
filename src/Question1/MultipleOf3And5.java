package Question1;

/**
 * Created by onur on 14.07.2017.
 */
public class MultipleOf3And5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Total is " + sum);
    }

}

