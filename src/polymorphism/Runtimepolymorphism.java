package polymorphism;

public class Runtimepolymorphism {
	public static void main(String[] args) {
       Employee E = new Employee();
       Employee a = new Sandeep();
       Employee j = new Jeevan();
       E.Dowork();
       a.Dowork();
       j.Dowork();
       
    }
}

