/**
 * Created by Onur Ertugral on 25.07.2017.
 * This program finds Pythagorean triplet for which a + b + c = 1000 and calculates a*b*c
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        for (int i = 1; i < 1000 ; i++) {
            for (int j = i + 1; j < 1000; j++) {
                for (int k = j + 1; k < 1000 ; k++) {
                    if (i + j + k == 1000 && i * i + j * j == k * k ) {
                        System.out.println(i + " " + j + " " + k + " " + (i * j * k));
                        System.exit(0);
                    }
                }
            }
        }
    }
}
