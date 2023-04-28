package operators;

public class Assignmentoperator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c; 
		
		System.out.println("c = " + (c=+a));
		System.out.println("c = " + (c=b+a));
		System.out.println("b = " + (b=b*a));
	}

}
