package Chapter8;

import java.util.Scanner;

/**
 * Program takes which salesmen earned how much on a specific day
 *
 * @author Emory Meursing
 */
public class P8 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] workers = {
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00}
        };
        String salesman, day, stop = "Y";
        do {
            System.out.println("Enter the salesman ID as A, B, C, D: ");
            salesman = input.next();
            if ("A".equals(salesman.toUpperCase()) || "B".equals(salesman.toUpperCase()) || "C".equals(salesman.toUpperCase()) || "D".equals(salesman.toUpperCase())) {
                System.out.println("Enter the day as M, T, W, H, or F: ");
                day = input.next();
                switch (salesman.toUpperCase()) {
                    case ("A"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("Enter the amount of sale: ");
                                workers[0][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("Enter the amount of sale: ");
                                workers[0][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("Enter the amount of sale: ");
                                workers[0][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("Enter the amount of sale: ");
                                workers[0][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("Enter the amount of sale: ");
                                workers[0][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("Invalid.");
                                break;
                        }
                        break;
                    case ("B"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("Enter the amount of sale: ");
                                workers[1][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("Enter the amount of sale: ");
                                workers[1][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("Enter the amount of sale: ");
                                workers[1][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("Enter the amount of sale: ");
                                workers[1][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("Enter the amount of sale: ");
                                workers[1][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("Invalid.");
                                break;
                        }
                        break;
                    case ("C"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("Enter the amount of sale: ");
                                workers[2][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("Enter the amount of sale: ");
                                workers[2][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("Enter the amount of sale: ");
                                workers[2][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("Enter the amount of sale: ");
                                workers[2][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("Enter the amount of sale: ");
                                workers[2][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("Invalid.");
                                break;
                        }
                        break;
                    case ("D"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("Enter the amount of sale: ");
                                workers[3][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("Enter the amount of sale: ");
                                workers[3][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("Enter the amount of sale: ");
                                workers[3][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("Enter the amount of sale: ");
                                workers[3][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("Enter the amount of sale: ");
                                workers[3][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("Invalid.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid.");
                        break;
                }
            } else {
                System.out.println("Invalid.");
            }
            do {
                System.out.println("More data? Enter Y for more or N to stop: ");
                stop = input.next();
            } while (!stop.toUpperCase().equals("N") && !stop.toUpperCase().equals("Y"));

            if (stop.toUpperCase().equals("N")) {
                System.out.println("Salesmen   \tM    \tT    \tW    \tH    \tF");
                System.out.print("A:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[0][y]);
                }
                System.out.println("\t   ");
                System.out.print("B:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[1][y]);
                }
                System.out.println("\t   ");
                System.out.print("C:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[2][y]);
                }
                System.out.println("\t   ");
                System.out.print("D:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[3][y]);
                }
                System.out.println("\t   ");
                return;
            }
        } while (!"N".equals(stop));
    }
}
