package filemanipulation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class calculateage {
	
	public static void main(String[] args) 
	{
		try {
		      Calendar cal1 = new GregorianCalendar();
		      Calendar cal2 = new GregorianCalendar();
		      int age = 0;
		      int factor = 0; 
		      Date date1 = new SimpleDateFormat("MM-dd-yyyy").parse("8-28-1989");
		      Date date2 = new SimpleDateFormat("MM-dd-yyyy").parse("3-9-2014");
		      cal1.setTime(date1);
		      cal2.setTime(date2);
		      if(cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
		            factor = -1; 
		      }
		      age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;
		      System.out.println("Your age is: "+age);
		} catch (ParseException e) {
		      System.out.println(e);
		}
	}

}
