import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int number;
        int space;
        int row;
        System.out.println ("Enter a number:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        for (space = 1; space < number; space++) {
            for (row = space; row <= number; row++) {
                System.out.print (" ");
            }
            for (row = 1; row <= space; row++) {
                System.out.print("*");
            }
        }
    }
}
