package exceptionhandling;

public class Exceptionhandling {
	public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
              System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }
    }

}
