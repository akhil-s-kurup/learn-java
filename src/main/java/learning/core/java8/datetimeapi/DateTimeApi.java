package learning.core.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApi {
// Local and Zoned
	
	
	public static void main(String[] args) {
		
		
		LocalDate lDate=LocalDate.now();
		System.out.println(lDate);
		
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		
		ZonedDateTime zDt=ZonedDateTime.now();
		ZoneId zoneId=ZoneId.of("Asia/Kolkata");
		zDt.withZoneSameInstant(zoneId);
		System.out.println(zDt);
	}
	
	
}
