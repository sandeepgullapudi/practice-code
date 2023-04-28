package polymorphism;

public class Compiletimepolymorphism {
	
	
	  void add(int a,int b) {
		System.out.println("addition on two parameters "  + (a+b));
	}
	  void add(int a,int b,int c) {
		  System.out.println("addition on three prarameters "  + (a+b+c));
	  }
	  public static void main(String[] args) {
		  Compiletimepolymorphism cm = new Compiletimepolymorphism();
		  cm.add(2, 3);
		  cm.add(4,2,4);
	  }
	

}
