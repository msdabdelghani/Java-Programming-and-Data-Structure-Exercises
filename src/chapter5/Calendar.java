package chapter5;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter the number of fist day of the year (Sun : 0, Mon : 1 ..): ");
		int startDay = input.nextInt();
		int currentDay = startDay;
		int numberOfDays = 0;
		int dayOfMonth;
		int days = 0;
		int count = 0;
		
		for(int month = 1; month <= 12; month++) {
			// Determine number of days in the month
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					numberOfDays = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					numberOfDays = 30;
					break;
				case 2:
					if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
						numberOfDays = 29;
					} else {
						numberOfDays = 28;
					}
					break;
			}
			System.out.printf("************************%02d/%4d************************\n", month, year);
			System.out.println("******************************************************");
			dayOfMonth = 1;
			for(int weeks = 0 ; weeks < 6; weeks++) {
				for(days = 0; days < 7; days++) {
					if(startDay <= days && dayOfMonth <= numberOfDays) {
						System.out.print(dayOfMonth + "\t" );
						dayOfMonth++;
						startDay = 0;
						currentDay = days;
					}
					else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
			startDay = currentDay + 1 == 7 ? 0 : currentDay + 1;
		}
		
		

	}

}
