package chapter4;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
			// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.nextLine();
		int dollars = Integer.parseInt(amount.substring(0, amount.indexOf(".")));
		int cents = Integer.parseInt(amount.substring(amount.indexOf(".") + 1, amount.length()));
		
		int remainingAmount = cents;
			// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
			// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
			// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
			// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
			// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + dollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
	}

}
