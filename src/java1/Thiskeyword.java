package java1;

public class Thiskeyword {
	public static class Main {
		  int x;
	public Main(int x) {
		    this.x = x;
		  }

		   public static void main(String[] args) {
		    Main myObj = new Main(10);
		    System.out.println("Value of x = " + myObj.x);
		  }
		}
}
