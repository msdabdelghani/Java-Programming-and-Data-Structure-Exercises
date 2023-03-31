package chapter4;

import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		input.nextLine(); // consume the end-of-line character
		System.out.print("Enter the first three letters of a month name (with the first letter in uppercase) : ");
		String month = input.nextLine();
		int numberOfDays = 0;
		
		// Determine number of days in the month
		switch (month) {
			case "Jan":
			case "Mar":
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
				numberOfDays = 31;
				break;
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				numberOfDays = 30;
				break;
			case "Feb":
				if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
					numberOfDays = 29;
				} else {
					numberOfDays = 28;
				}
				break;
			default : 
				System.out.println("Invalid month");
				System.exit(1);
		}
		System.out.println("Number of days in " + month + " " + year + " is " + numberOfDays);
		}

}
