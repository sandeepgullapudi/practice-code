package collections;
import java.util.*;


public class Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(24);
		hs.add(1);
		hs.add(6);
		hs.add(56);
		hs.add(97);
		hs.add(30);
		hs.add(25);
		System.out.println(hs.remove(6));// data
		System.out.println(hs);
		System.out.println(hs.contains(11));
		for(Integer element:hs) {
			System.out.println(element);
		}
			
		
		
    }
}