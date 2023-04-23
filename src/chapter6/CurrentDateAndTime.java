package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		System.out.println("Current day and time is : " + currentDayAndMonth() + ", " + currentYear() + " " + currentHourGMT1() + ":" + currentMinute() + ":" + currentSecond() );
	}
	
	public static String currentDayAndMonth() {
		int year = 1970;
		int month = 1;
		String str = "";
		long remainingDays = totalDays();
		while(remainingDays > 365) {
			remainingDays -= isLeapYear(year) ? 366 : 365;
			year++;
		}
		for(; month <= 12; month++ ) {
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
		switch(month) {
		case 1: str="January"; break; case 2: str="February"; break; case 3: str="March"; break; case 4: str="April"; break; case 5: str="May"; break; case 6: str="June"; break; case 7: str="July"; break; case 8: str="August"; break; case 9: str="September"; break; case 10: str="October"; break; case 11: str="November"; break; case 12: str="December"; break; 
		}
		return str + " " + currentDay;
	}
	
	public static String currentYear() {
		int year = 1970;
		long totalDays = totalDays();
		while(totalDays > 365) {
			totalDays -= isLeapYear(year) ? 366 : 365;
			year++;
		}
		return year + "";
	}
	
	public static long totalDays() {
		return totalSeconds() / (24 * 60 * 60);
	}
	
	
	public static String currentHourGMT1() {
		long totalHour = totalSeconds() / (60 * 60);
		return leadingZero((int)(totalHour % 24 + 1));
	}
	
	public static String currentMinute() {
		long totalMinute = totalSeconds() / 60;
		return leadingZero((int)(totalMinute % 60));
	}
	
	public static String currentSecond() {
		return leadingZero((int)(totalSeconds() % 60));
	}
	
	public static long totalSeconds() {
		return System.currentTimeMillis() / 1000;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);		
	}
	
	public static String leadingZero(int number) {
		String str = number + "";
		if(str.length() > 1) 
			return str;
		else
			return "0" + str;
	}
}
