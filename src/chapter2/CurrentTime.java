package chapter2;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		
		// Calculate the current time offset to GMT
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHoursGMT = totalHours % 24;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		
		int timeZone = input.nextInt();
		
		System.out.println("The current time is " + ( currentHoursGMT + timeZone ) + ":" + currentMinutes + ":" + currentSeconds);
	}

}
