package variable;

public class Staticvariable {
	int rollno;
	String name;
	static String college = "ITS";

	Staticvariable(int r, String n,String c) {
		rollno = r;
		name = n;
		college = c;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Staticvariable s1 = new Staticvariable(111, "Karan","sandeep");
		s1.display();
		Staticvariable s2 = new Staticvariable(222, "Aryan","jeevan");
		s2.display();

	}

}
