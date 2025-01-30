package Que6;

public class Pattern {
	 public static void main(String[] args) {
	        int rows = 5;
	        
	        for (int i = 1; i <= rows; i++) {
	            int num = 6;
	            
	            for (int j = 1; j <= i; j++) {
	                
	                num--;
	                System.out.print(num + " ");
	            }
	            
	            for (int j = i; j < rows; j++) {
	                System.out.print(num + " ");
	            }
	            
	            System.out.println();
	        }
	    }
	}
