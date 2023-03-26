package chapter2;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program calculates the sum of digits of a given number between 0 and 1000. e.g : 932 : 9+3+2 = 14
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int lastDigit = number % 10;
		int secondLastDigit = (number / 10) % 10;
		int thirdLastDigit = (number / 100) % 10;
		
		System.out.println( lastDigit + secondLastDigit + thirdLastDigit );
		
	}

}
