package ImpJavaPrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateProgram {

	public static void main(String[] args) {
		
		
		DateTimeFormatter dfs=DateTimeFormatter.ofPattern("dd MM yyyy");
		
		String date1="12 04 2021";
		String date2="14 04 2021";
		
		LocalDate d1=LocalDate.parse(date1,dfs);
		LocalDate d2=LocalDate.parse(date2, dfs);
		
		Long diff=ChronoUnit.DAYS.between(d1, d2);
		
		System.out.println(diff);

	}

}
