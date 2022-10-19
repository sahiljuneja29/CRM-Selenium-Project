package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program7 {

	public static void main(String[] args) {
		// Java program to display the system time
		
		System.out.format("Current Date time: %tc%n" ,System.currentTimeMillis());
		
		//Java program to display the current date time in specific format
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}

}