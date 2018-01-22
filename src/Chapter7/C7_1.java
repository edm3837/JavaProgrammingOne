package Chapter7;

import java.util.Scanner;

/**
 * Program assigns students grades curved to the highest score
 *
 * @author Emory Meursing
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people, best = 0, newest;
        int[] grades;

        System.out.println("Please enter number of students: ");
        people = input.nextInt();
        grades = new int[people];

        System.out.println("Please enter their " + people + " scores: ");
        for (int x = 0; x < people; x++) {
            grades[x] = input.nextInt();
            newest = grades[x];
            if (newest > best) {
                best = newest;
            }
            if (x == people - 1) {
                break;
            }
        }
        for (int x = 0; x < people; x++) {
            if (grades[x] >= best - 10) {
                System.out.println("Student " + x + " score is " + grades[x] + " grade is A");
            } else if (grades[x] >= best - 20) {
                System.out.println("Student " + x + " score is " + grades[x] + " grade is B");
            } else if (grades[x] >= best - 30) {
                System.out.println("Student " + x + " score is " + grades[x] + " grade is C");
            } else if (grades[x] >= best - 40) {
                System.out.println("Student " + x + " score is " + grades[x] + " grade is D");
            } else {
                System.out.println("Student " + x + " score is " + grades[x] + " grade is F");
            }
            if (x == people - 1) {
                break;
            }
        }
    }
}
