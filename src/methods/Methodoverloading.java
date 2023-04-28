package methods;

public class Methodoverloading {
	public void print(int num) {
        System.out.println("The number is: " + num);
    }
    
    public void print(String text) {
        System.out.println("The text is: " + text);
    }
    
    public void print(double num) {
        System.out.println("The double number is: " + num);
    }
    
    public static void main(String[] args) {
    	Methodoverloading obj = new Methodoverloading();
        obj.print(10);
        obj.print("Hello, World!");
        obj.print(3.14);
    }
}
