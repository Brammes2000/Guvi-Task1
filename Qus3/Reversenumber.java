package Qus3;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
       int number = obj.nextInt();
        
        int reversednumber = 0;
        
        
        while (number != 0) {
            int digit = number % 10; // Get last digit
            reversednumber = reversednumber * 10 + digit; // Append digit to reversed number
            number /= 10; // Remove last digit
        }
        
      
        System.out.println("Reversed Number: " + reversednumber);
        
       
    }
}
