import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int number;
        int space;
        int row;
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number % 2 == 0) {

            // First star of even diamond
            for (space = 1; space <= (number) - 1; space++) {
                System.out.print("  ");
            }
            System.out.println(" *");

            // Top half of even diamond
            for (space = 2; space <= (number / 2) + 1; space++) {
                for (row = space; row <= number; row++) {
                    System.out.print("  ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("* ");
                }
                for (row = 2; row < space; row++) {
                    System.out.print("* ");
                }
                System.out.print("*\n");
            }

            // Bottom half of even diamond
            for (space = (number / 2); space >= 2; space--) {
                for (row = space; row <= number; row++) {
                    System.out.print("  ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("* ");
                }
                for (row = 2; row < space; row++) {
                    System.out.print("* ");
                }
                System.out.print("*\n");
            }
            for (space = 1; space <= (number) - 1; space++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        } else {

            // Top half of odd diamond
            number = (number + 1) / 2;
            for (space = 1; space <= number; space++) {
                for (row = space; row <= number; row++) {
                    System.out.print(" ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("**");
                }
                System.out.print("*\n");
            }

            // Bottom half of odd diamond
            for (space = number - 1; space >= 1; space--) {
                for (row = space; row <= number; row++) {
                    System.out.print(" ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("**");
                }
                System.out.print("*\n");
            }
        }
    }
}
