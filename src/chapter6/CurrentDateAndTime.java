package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		System.out.println(currentHour() + ":" + currentMinute() + ":" + currentSecond() + " " + totalDays());
	}
	
	public static int currentYear() {
		long days = 0;
		int year = 1970;
		while(days < totalDays()) {
			if(isLeapYear(year)) 
				days += 366;
			else
				days += 365;
			year++;
		}
		return year;
	}
	
	public static long totalDays() {
		//return totalSeconds() / (24 * 60 * 60);
		System.out.println(totalSeconds() / (24 * 60 * 60));
		System.out.println((totalSeconds() / (24 * 60 * 60)) % 365);
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
