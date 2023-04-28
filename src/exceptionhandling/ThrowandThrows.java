package exceptionhandling;

public class ThrowandThrows {
	public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }

}
