package inheritance;

public class Inheritance {
	float salary = 10000;
	static class Programmer extends Inheritance{ 
		int bonus=10000;  
 public static void main(String args[]){  
		   Programmer p=new Programmer();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}
  }
}