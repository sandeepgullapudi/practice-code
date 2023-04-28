package constructors;

public class Cronstructorswithparameters {
	int x;

	public Cronstructorswithparameters(int i) {
		x = i;

	}

	public static void main(String[] args) {
		Cronstructorswithparameters t1 = new Cronstructorswithparameters(10);
		Cronstructorswithparameters t2 = new Cronstructorswithparameters(20);
		System.out.println(t1.x + " " + t2.x);
	}

}
