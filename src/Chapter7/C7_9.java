package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program finds the minimum number of an array
 *
 * @author Emory Meursing
 */
public class C7_9 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Please enter 10 numbers: ");
        for (int x = 0; x < 10; x++) {
            numbers[x] = input.nextDouble();
        }
        System.out.println("The minimum number is " + min(numbers));
    }

    /**
     * Method sorts the array
     *
     * @param array array of the program
     * @return the first variable in the sorted array
     */
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
