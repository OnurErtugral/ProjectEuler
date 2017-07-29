package Q11_LargestProductInAGrind;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The hardest problem so far!
 *
 * Created by Onur Ertugral on 29.07.2017.
 *
 * This program he greatest product of four adjacent numbers in the same
 * direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */
public class LaregstProduct {
    public static void main(String[] args) {
        int[][] data = new int[20][20];
        long max = 1;
        long product = 1;
        int count = 0;

        try {
            Scanner input = new Scanner(new File("Grind.txt"));
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    data[i][j] = Integer.parseInt(input.next());
                }
            }
            //Left to right
            for (int k = 0; k < 17; k++) {
                for (int j = 0; j < 17; j++) {
                    for (int i = 0; i < 4; i++) {
                        product *= data[i + k][i + j];
                    }
                    if (product > max) {
                        count++;
                        max = product;
                        System.out.printf("%d. %d %d: %d\n",count,k,j,max);
                    }
                    product = 1;
                }
            }
            System.out.println("Max: " + max);
            System.out.println();

            //Right to left
            int help = 0;
            for (int k = 0; k < 17; k++) {
                for (int j = 0; j < 17; j++) {
                    for (int i = 19; i >= 16; i--, help++) {
                        product *= data[help + k][i - j];
                    }
                    help = 0;
                    if (product > max) {
                        count++;
                        max = product;
                        System.out.printf("%d. %d %d: %d\n", count, k, j, max);
                    }
                    product = 1;
                }
            }
            System.out.println("Max: " + max);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}