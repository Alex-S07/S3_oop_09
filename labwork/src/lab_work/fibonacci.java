package lab_work;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
            
        int a = 0, b = 1;
        int count = 0;
            
        while (count < n) {
            if (count == 0) {
                System.out.print(a + " ");
            } else if (count == 1) {
                System.out.print(b + " ");
            } else {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            count++;
        }
            
           System.out.println(); 
        scanner.close();
    }
}
