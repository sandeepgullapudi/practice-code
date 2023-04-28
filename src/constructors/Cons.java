package constructors;

public class Cons {
	String name;
	public Cons()
	{
		System.out.println("Constructor Called:");
		name = "sandeep";
	}
	public static void main(String[] args)
	{
	    Cons obj=new Cons();
	    System.out.println("the name is" + obj.name);
    
}
}
