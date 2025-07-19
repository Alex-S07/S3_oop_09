package lab_work;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.print("Enter a number to reverse: ");
            int number = SC.nextInt();

            int temp = number;
            int rev = 0;
            for (; temp != 0; temp /= 10) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
            }

            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + rev);
        }
    }
}
