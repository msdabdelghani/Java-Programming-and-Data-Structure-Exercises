package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		System.out.println(currentHour() + ":" + currentMinute() + ":" + currentSecond() + " " + currentYear());
	}
	
	public static int currentYear() {
		int year = 1970;
		int daysOfYear;
		long totalDays = totalDays();
		while(totalDays > 365) {
			if(isLeapYear(year)) 
				daysOfYear = 366;
			else
				daysOfYear = 365;
			year++;
			totalDays = totalDays - daysOfYear;
		}
		return year;
	}
	
	public static long totalDays() {
		return totalSeconds() / (24 * 60 * 60);
	}
	
	
	public static long currentHour() {
		long totalHour = totalSeconds() / (60 * 60);
		return totalHour % 24;
	}
	
	public static long currentMinute() {
		long totalMinute = totalSeconds() / 60;
		return totalMinute % 60;
	}
	
	public static long currentSecond() {
		return totalSeconds() % 60;
	}
	
	public static long totalSeconds() {
		return System.currentTimeMillis() / 1000;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);		
	}
}
