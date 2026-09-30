package sumOfNums.java;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int aantal = 0;

        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();

        while (number != -1 && aantal < 10) {
            sum = sum + number;
            aantal++;

            if (aantal < 10) {
                System.out.print("Enter a number (-1 to quit): ");
                number = console.nextInt();
            }
        }

        System.out.println("The sum is " + sum);
    }
}