package chapter2;

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {
		
		// Without using loops, display the account value after the sixth month of saving with interest rate of 5%
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		
		int savingAmount = input.nextInt();
		
		final double MOUNTHLY_INTEREST_RATE = 0.05 / 12;
		
		double firstMounthSaving = savingAmount * (1 + MOUNTHLY_INTEREST_RATE);
		
		double secondMounthSaving = (100 + firstMounthSaving) * (1 + MOUNTHLY_INTEREST_RATE);
		
		double thirdMounthSaving = (100 + secondMounthSaving) * (1 + MOUNTHLY_INTEREST_RATE);
		
		double fourthMounthSaving = (100 + thirdMounthSaving) * (1 + MOUNTHLY_INTEREST_RATE);
		
		double fifthMounthSaving = (100 + fourthMounthSaving) * (1 + MOUNTHLY_INTEREST_RATE);
		
		double sixthMounthSaving = (100 + fifthMounthSaving) * (1 + MOUNTHLY_INTEREST_RATE);
		
		System.out.println("After the sixth month, the account value is $" + (int) (sixthMounthSaving * 100) / 100.0);
		
	}

}
