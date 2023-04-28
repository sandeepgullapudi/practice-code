package java1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateandTime {
	public static void main(String args[]) {
	       Date date = new Date();
	       LocalDateTime myDateObj = LocalDateTime.now();
	       System.out.println("Before formatting: " + myDateObj);
	       DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	       String formattedDate = myDateObj.format(myFormatObj);
	       System.out.println("After formatting: " + formattedDate);
	     

	       System.out.println(date.toString());
	   }
	}


