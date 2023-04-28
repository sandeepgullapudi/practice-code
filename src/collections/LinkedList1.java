package collections;
import java.util.*;

public class LinkedList1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("G");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("s");
		ll.add("a");
		ll.add("d");
		ll.add(2,"n");
		ll.addAll(0,al);
		ll.remove(3);
		ll.removeAll(al);
		ll.set(1, "ss");
		System.out.println("retrival" + ll.get(2));
		System.out.println("size" + ll.size());
		System.out.println(ll.contains("d"));
		System.out.println(ll);
		
		
	}
}
