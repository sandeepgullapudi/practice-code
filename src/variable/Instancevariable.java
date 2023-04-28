package variable;

public class Instancevariable {
	int i;
	public Instancevariable()
	{
		System.out.println("instance variables");
		i= 10;
	}
	public static void main(String[] args)
	{
		Instancevariable obj=new Instancevariable();
	    System.out.println("is" + obj.i);
	}
}
