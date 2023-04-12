package chapter5;

import java.util.Scanner;

public class MeanAndDeviation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = 10;
		double sumOfX = 0, sumOfX2 = 0;
		System.out.print("Enter 10 numbers: ");
		for(int i = 1;i <= n;i++) {
			double number =  input.nextDouble();
			sumOfX += number;
			sumOfX2 += number * number;
		}
		double mean = sumOfX / n;
		double deviation = Math.sqrt((sumOfX2 - (sumOfX * sumOfX / n)) / (n -1));
		System.out.println("The mean is " + mean);
		System.out.println("The deviation is " + deviation);

	}

}
