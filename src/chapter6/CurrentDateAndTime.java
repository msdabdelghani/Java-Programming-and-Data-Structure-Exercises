package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		System.out.println(currentHour() + ":" + currentMinute() + ":" + currentSecond() + " " + currentYear()+ " " + currentDay());
	}
	
	public static int currentDay() {
		int year = 1970;
		long remainingDays = totalDays();
		while(remainingDays > 365) {
			remainingDays -= isLeapYear(year) ? 366 : 365;
			year++;
		}
		for(int month = 1; month <= 12; month++ ) {
			int daysOfMonth = 0;
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12 : 
				daysOfMonth = 31;
				break;
			case 4: case 6: case 9: case 11:
				daysOfMonth = 30;
				break;
			case 2:
				daysOfMonth = isLeapYear(year) ? 29 : 28;
				break;
			}
			if(remainingDays <= daysOfMonth) break;
			else remainingDays -= daysOfMonth;
		}
		int currentDay = (int)remainingDays + 1;
		return currentDay;
	}
	
	public static int currentYear() {
		int year = 1970;
		long totalDays = totalDays();
		while(totalDays > 365) {
			totalDays -= isLeapYear(year) ? 366 : 365;
			year++;
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
