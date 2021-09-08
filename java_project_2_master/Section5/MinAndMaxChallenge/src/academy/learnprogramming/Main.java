package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0; //Integer.MAX_Value
        int min = 0; //Integer.MIN_Value
        boolean first = true;

        while(true) {
            System.out.println("Enter a number:");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();

                // Code added introduced boolean due to possibility min value is greater than 0.
                // Another possible solution set minimum to max int number (roughly +2 billion) and max to min int number(roughly -2 billion)
                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

        scanner.close();
    }
}
