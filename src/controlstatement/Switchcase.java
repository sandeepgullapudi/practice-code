package controlstatement;

public class Switchcase {
	public static void main(String args[]) {
	     char grade = 'g';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!");
	            break;
	         case 'B' :
	        	 System.out.println("Average");
	        	 break;
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	            break;
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }

}
