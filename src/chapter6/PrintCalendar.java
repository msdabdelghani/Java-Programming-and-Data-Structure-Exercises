package chapter6;

import java.util.Scanner;

public class PrintCalendar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the year
		System.out.print("Enter full year (e.g., 2021): ");
		int year = input.nextInt();
		
		// Prompt the user to enter month
		System.out.print("Enter month as number between 1 and 12: ");
		int month = input.nextInt();
		
		// Print calendar for the month of the year
		printMonth(year, month);
		
		System.out.println("The start of day is " + getStartDay(year, month));
		
	}
	
	public static void printMonth(int year, int month) {
		System.out.println(month + " " + year);
	}
	
	public static void printMonthTitle(int year, int month) {
	}
	
	public static void printMonthBody(int year, int month) {
		
	}
	
	public static String getMonthName(int month) {
		return "February";	// A dummy value
	}
	
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		return (START_DAY_FOR_JAN_1_1800 + getTotalNumberOfDays(year, month)) % 7;		
	}
	
	public static int getTotalNumberOfDays(int year, int month) {
		int totalNumberOfDays = 0;
		for(int i=1800; i < year; i++) {
			if(isLeapYear(i)) {
				totalNumberOfDays += 366;
			}else {
				totalNumberOfDays += 365;
			}
		}
		for(int j=1; j < month; j++) {
			totalNumberOfDays += getNumberOfDaysInMonth(year, j);
		}
		return totalNumberOfDays;
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
		int numberOfDaysInMonth = 0;
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				numberOfDaysInMonth = 31; 
				break;
			case 4: case 6: case 9: case 11: 
				numberOfDaysInMonth = 30;
				break;
			case 2: 
				numberOfDaysInMonth = isLeapYear(year) ? 29 : 28;
				break;
			default :
				System.exit(0);
		}
		return numberOfDaysInMonth;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);		
	}

}
