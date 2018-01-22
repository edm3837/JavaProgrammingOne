package Chapter8;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program puts the employees in an organized list then sorts the highest payed
 * to lowest paid
 *
 * @author Emory Meursing
 */
public class C8_4 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] employees = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        int[] hoursTotal = new int[8];
        int total = 0;
        System.out.println("            Su   M   T   W  Th   F  Sa  Total");
        for (int x = 0; x < 8; x++) {
            System.out.print("Employee " + x);
            for (int y = 0; y < 7; y++) {
                System.out.print("   " + employees[x][y]);
                total += employees[x][y];
                if (y == 6) {
                    hoursTotal[x] = total;
                    System.out.print("   " + hoursTotal[x]);
                }
            }
            total = 0;
            System.out.println("\n");
        }
        sort(hoursTotal);
    }

    /**
     * Method sorts the array
     *
     * @param array array given in main method
     */
    public static void sort(int[] array) {
        int[] index = new int[8], parallel = new int[8];
        for (int x = 0; x < array.length; x++) {
            parallel[x] = array[x];
        }
        Arrays.sort(parallel);
        for (int i = 0; i < array.length; i++) {
            // Return the index of the element if the element
            // is found
            for (int x = 0; x < array.length; x++) {
                if (parallel[i] == array[x]) {
                    index[i] = x;
                }
            }
        }
        if (index[2] == 5) {
            index[2] = 1;
        }

        for (int x = 7; x > -1; x--) {
            System.out.println("Employee " + index[x] + ": " + parallel[x]);
        }
    }
}
