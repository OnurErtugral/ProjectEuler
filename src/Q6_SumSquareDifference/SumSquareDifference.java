/**
 * Created by Onur Ertugral on 25.07.2017.
 * This program finds Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int sum = 0;
        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            squareSum += Math.pow(i, 2);
            sum += i;
        }
        System.out.printf("%.0f", Math.pow(sum,2) - squareSum);
    }
}
