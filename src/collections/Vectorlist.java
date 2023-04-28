package collections;
import java.util.*;

public class Vectorlist {
	
	public static void main (String[] args) {
	 Vector<String>v = new Vector<>();
	v.add("sandeep");
	v.add("jeevan");
	v.add(1,"sai kiran");
	v.add("24");
	v.add("s");
	v.add("j");
	v.add("q");
	v.add("w");
	v.add("f");
	v.add("h");
	v.add("24");
	v.add("s");
	v.add("j");
	v.add("q");
	v.add("w");
	v.add("f");
	v.add("h");
	Vector v1 = new Vector();
	v1.add("ramesh");
	v1.add("suresh");
	System.out.println(v1);
	v.addAll(v1);
	v.removeAll(v1);
	v.set(4, "satish");
	
		
	
	System.out.println(v);
	System.out.println("size" + v.size());
	System.out.println("capacity" + v.capacity());
	System.out.println("retrival" + v.get(2));
	System.out.println("remove"+ v.remove(3));
	System.out.println(v.contains("sai kiran"));
	System.out.println(v.indexOf("satish"));
	System.out.println(v.lastElement());
	System.out.println(v.firstElement());
	Object[] arr=v1.toArray();
	System.out.println(Arrays.toString(arr));
	
	
	 
	 System.out.println(v);
	 
	}

	
	

}
