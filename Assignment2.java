import java.util.Scanner;  // Import the Scanner class

public class Assignment2 {
    public static void main(String[] args) {
        double number;
        double space = 0;
        double column;
        double row;
        System.out.println ("Enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextDouble();


        number = number / 2.1;                                          //Breaks input in half

        if (space != number) {
            for (space = 0; space > number; space ++)
            System.out.print(" ");
            }
        else

            for (space = 0; space > number; space ++)
            System.out.print("*");

        for (column = 0; column < number; column++) {
            for (row = 0; row < column; row++) {
                System.out.print("**");
            }
            System.out.print("*\n");
        }
    }
}

