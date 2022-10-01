import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int number;
        int space;
        int row;
        int numberClone = 1;
        int spaceClone = 1;
        int rowClone = 1;
        System.out.println ("Enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number % 2 == 0) {

            for (space = 1; space <= (number / 2) + 1; space++) {                   //Top half of diamond
                for (row = space; row <= number; row++) {
                    System.out.print(" ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("* ");
                }
                System.out.print("*\n");
            }



        }

        else {
            number = (number + 1) / 2;

            for (space = 1; space <= number; space++) {                   //Top half of diamond
                for (row = space; row <= number; row++) {
                    System.out.print(" ");
                }
                for (row = 1; row < space; row++) {
                    System.out.print("**");
                }
                System.out.print("*\n");
            }

            for (space = number - 1; space >= 1; space--) {                   //Bottom half of diamond
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
