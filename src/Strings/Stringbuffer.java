package Strings;
public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		sb.insert(1,"phase");
		sb.replace(0,1,"Java");
		sb.delete(1,3);
		sb.reverse();
		System.out.println(sb.capacity());
		System.out.println(sb);
	}
	

}