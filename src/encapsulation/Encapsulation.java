package encapsulation;

public class Encapsulation {
	public static void main(String[] args)
    {
        Person p = new Person();
        p.setName("Sandeep");
        p.setAge(24);
 
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }

}
