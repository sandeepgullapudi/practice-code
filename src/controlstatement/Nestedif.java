package controlstatement;

public class Nestedif {
	    public static void main(String[] args) {
	        int number = 56;
	  	        if (number <= 100) {
	            if (number < 50) {
	                System.out.print("Value is smaller than 50");
	            } else if (number == 50) {
	                System.out.print("Value is 50");
	            } else {
	                System.out.print("Value is between 51 and 100");
	            }
	        } else {
	            System.out.print("Value is greater than 100");
	        }
	    }
}


