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
		return 1;			// A dummy value
	}
	
	public static int getTotalNumberOfDays(int year, int month) {
		return 100000;		// A dummy value
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
		return 30;			// A dummy value
	}
	
	public static boolean isLeapYear(int year) {
		return true;		// A dummy value
	}

}
