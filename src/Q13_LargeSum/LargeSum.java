package Q13_LargeSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Onur Ertugral on 30.07.2017.
 * This program works out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */
public class LargeSum {
    public static void main(String[] args) {
        int lap = 1;
        BigInteger sum = new BigInteger("0");

        try {
            Scanner input = new Scanner(new File("/home/onur/IdeaProjects/ProjectEuler/src/Q13_LargeSum/Data"));
            while (input.hasNextLine()) {
                sum = sum.add(input.nextBigInteger());
                System.out.printf("%d: %s\n", lap, sum);
                lap++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
