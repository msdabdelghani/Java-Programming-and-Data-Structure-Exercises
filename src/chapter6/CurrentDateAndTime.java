package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		System.out.println(currentHour() + ":" + currentMinute() + ":" + currentSecond());
	}
	
	
	
	public static long currentHour() {
		long totalHour = totalSeconds() / (60 * 60);
		return totalHour % 60;
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
