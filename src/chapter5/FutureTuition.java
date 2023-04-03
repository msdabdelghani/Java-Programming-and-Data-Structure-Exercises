package chapter5;

import java.util.Scanner;

public class FutureTuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tuition : ");
		double tuition = input.nextDouble();
		final double INITIAL_TUITION = tuition;
		System.out.print("Enter increase in percentage : ");
		int increase = input.nextInt();
		int year = 0;
		while(tuition < INITIAL_TUITION * 2) {
			tuition = tuition * (1 + increase / 100.0);
			year++;
		}
		System.out.println("Your tuition will be double it's current value in " + year + " years");
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
