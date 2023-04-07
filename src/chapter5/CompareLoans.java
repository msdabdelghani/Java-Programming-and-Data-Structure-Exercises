package chapter5;

import java.util.Scanner;

public class CompareLoans {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount : ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter number of years : ");
		int numberOfYears = input.nextInt();
		input.close();

		System.out.println("Interest Rate\t Monthly Paiement\t Total Payment");
		for(double i = 5; i <= 8; i = i + 0.125) {
			double monthlyInterestRate = i / 1200;
			double monthlyPaiement = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1+monthlyInterestRate, numberOfYears * 12));
			double totalAmount = monthlyPaiement * numberOfYears * 12;
			System.out.printf("%4.3f%%\t\t %5.2f \t\t %7.2f", i, monthlyPaiement, totalAmount  );
			System.out.println();
		}
	}

}
