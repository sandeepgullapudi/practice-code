package generics;

import java.util.ArrayList;

public class Generics {
	public static void main (String[] args) {
		ArrayList<Integer> al= new ArrayList();
		//al.add("str1");
		al.add(24);
		al.add(67);
		al.add(24);
		
		
		int a=al.get(2);
		System.out.println(a);
		
		
				
	}

}
