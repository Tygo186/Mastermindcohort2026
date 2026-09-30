package whileLoops;

import java.util.Scanner;

public class SquareRootWhile {

    public static void main(String args[]) {

        System.out.print("Type a non - negative integer: ");

        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        int sum = 0;

        while (number != -1) {

            sum = sum + number;

            System.out.print("Type a number: ");
            number = console.nextInt();
        }

        System.out.print(sum);
    }
}