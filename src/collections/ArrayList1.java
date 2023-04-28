package collections;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(4);
		a1.add(2);
		a1.add(9);
		a1.add(4);
		a1.add(1);
		a1.add(3);
		a1.add(9);
		a1.add(4);
		a1.add(10);
		a1.add(22);
		a1.add(19);
		a1.add(41);
		a1.add(10);
		a1.remove(2);
		ArrayList<Integer> a2 = new ArrayList();
		a2.add(3);
		a2.add(15);
		a2.add(31);
		System.out.println(a2);
		a1.addAll(a2);
		a1.removeAll(a2);
		a1.set(0,24);
		System.out.println("size"+a1.size());
		System.out.println("remove"+ a1.remove(3));
		System.out.println(a1.contains("24"));
		System.out.println("retrival" + a1.get(2));
		
		
		System.out.println(a1);
		

	}

	
 
	}
	

