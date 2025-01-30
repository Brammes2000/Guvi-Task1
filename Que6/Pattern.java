package Que6;

public class Pattern {
    public static void main(String[] args) {
		        int num = 5;
		        
		        for (int i = 1; i <= num; i++) {
		            int range = 5;
		            
		            for (int j = 1; j <= i; j++) {
		                System.out.print(range + " ");
		                range--;
		            }
		            
		            for (int j = i; j < num; j++) {
		                System.out.print(range + " ");
		            }
		            
		            System.out.println();
		        }
		    }
		}
