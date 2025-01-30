package Que5;
import java.util.Scanner;
public class discount {
	public static void main(String[] args) {

	 Scanner obj = new Scanner(System.in);
     
     System.out.print("Enter the purchase amount: ");
     double purchaseAmount = obj.nextDouble();
     
     double discount = 0;
     
     // Applying discount based on purchase amount
     if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
         discount = 0.10 * purchaseAmount; // 10% discount
     } else if (purchaseAmount > 1000) {
         discount = 0.20 * purchaseAmount; // 20% discount
     }
     
     
     double finalAmount = purchaseAmount - discount;
     
    
     System.out.println("Purchase Amount: " + purchaseAmount);
     System.out.println("Discount Applied:" + discount);
     System.out.println("Final Payable Amount: " + finalAmount);
     
  
 }
}
