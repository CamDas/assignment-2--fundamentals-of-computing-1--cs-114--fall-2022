import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        double number;
        double space;
        double row;
        System.out.println ("Enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextDouble();

        number = number / 1.5;                                        //Breaks up input in half

        for (space = 1; space <= number; space++) {                   //Top half of diamond
            for (row = space; row <= number; row++) {
                System.out.print(" ");
            }
            for (row = 1; row < space; row++) {
                System.out.print("**");
            }
            for (row = 1; row <= space; row++) {
            }
                System.out.print("*\n");
            }

    }
}
