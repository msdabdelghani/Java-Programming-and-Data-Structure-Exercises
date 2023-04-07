package chapter5;

import java.util.Scanner;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount : ");
		double balance = input.nextDouble();
		System.out.print("Enter number of years : ");
		int numberOfYears = input.nextInt();
		System.out.print("Enter annual interest rate : ");
		double annualInterestRate = input.nextDouble();
		input.close();
		double monthlyInterestRate = annualInterestRate / 1200.0;
		double monthlyPayment = balance * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			if (Math.abs(balance) < 0.01) {
			    double lastPayment = monthlyPayment + balance;
			    System.out.printf("%-2d\t\t%8.2f\t%9.2f\t%7.2f", numberOfYears * 12, 0.0, lastPayment, 0.0);
			} else {
			    System.out.printf("%-2d\t\t%8.2f\t%9.2f\t%7.2f",  i, interest, principal, balance);
			}
			System.out.println();
		}
	}

}
