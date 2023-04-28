package java1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexperssion {
 

public static void main (String[] args) {
	  Pattern pattern = Pattern.compile("java practice in eclipse", Pattern.CASE_INSENSITIVE);
	  Matcher matcher = pattern.matcher("java practice in eclipse in phase1 intern");
	  boolean matchfound = matcher.find();
	  if(matchfound) {
		  System.out.println("match was founded");
	  }
	  else {
		  System.out.println("match was not founded");
	  }
	  System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","sandy5"));
	  
  }
	  
  }

