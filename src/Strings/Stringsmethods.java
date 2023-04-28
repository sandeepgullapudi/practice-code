package Strings;

public class Stringsmethods{
		public static void main(String args[]) {
	      String s = "Strings are immutable";
	      char result = s.charAt(2);
	      System.out.println(result);
	      String str1 = "Strings are immutable";
	      String str2 = "Strings are immutable";
	      String str3 = "Integers are not immutable";
	      
	      int result1 = str1.compareTo( str2 );
	      System.out.println(result1);
	      
	      result1 = str2.compareTo( str3 );
	      System.out.println(result1);
	      s = s.concat(" all the time");
	      System.out.println(s);
	      boolean  result2 = str1.contentEquals( str3 );
	      System.out.println(result2);
	      result2 = str1.contentEquals( str2 );
	      System.out.println(result2);
	      result2 = str2.contentEquals( str3 );
	      System.out.println(result2);
	      char[] Str4 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	      String Str5 = "";
	      Str5 = Str5.copyValueOf( Str4 );
	      Str5 = Str5.copyValueOf( Str4, 2, 6 );
	      System.out.println("Returned String: " + Str5);
	      String Str6 = new String("This is really not immutable!!");
	      boolean retVal;
	      retVal = Str6.endsWith( "immutable!!" );
	      System.out.println("Returned Value = " + retVal );
	      retVal = Str6.endsWith( "immu" );
	      System.out.println("Returned Value = " + retVal );
	      String str7 = "STRINGS ARE IMMUTABLE";
	      String str8 = str1;
	      boolean retVal1;
	      retVal1 = str1.equals( str2 );
	      System.out.println("Returned Value = " + retVal1 );
	      retVal1 = str1.equals( str7 );
	      System.out.println("Returned Value = " + retVal1);
	      retVal1 = str2.equalsIgnoreCase( str8 );
	      System.out.println("Returned Value = " + retVal1 );
	      System.out.println("Hashcode for str1 :" + str1.hashCode() );
	      System.out.println(str1.indexOf( 'u' ));
	      System.out.println(str1.indexOf( 'a', 15 ));
	      String Substr1 = new String("immutable" );
	      System.out.println(str1.indexOf( Substr1 ));
	}
	   
}

