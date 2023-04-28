package collections;
import java.util.*;
import java.util.Set;

public class Maps{

	public static void main(String[] args) {
		Map<Integer,String> m = new TreeMap<>();
		m.put(101,"jeevan");
		m.put(102, "saikiran");
		m.put(103, "sandeep");
		Set<Integer> keys = m.keySet();
		for (Integer key : keys) {
			System.out.println(keys);
		}
		System.out.println();
		Collection<String> values = m.values();
		for (String value : values) 
		{
			System.out.println(values);
		}
		System.out.println();
		System.out.println(m.get(101));
		
		
		System.out.println(m);
		m.remove(103);
		System.out.println(m);
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(103));
		System.out.println(m.containsValue("jeevan"));
		m.putIfAbsent(101,"prasanna");
		System.out.println(m);
		m.replace(102, "prasana");
		System.out.println(m);
		System.out.println(m.size());
		m.clear();
		System.out.println(m);
		
	 
		
	}

}
