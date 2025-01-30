package Qus2;

import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        double number = obj.nextDouble();
        
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
            }
}
