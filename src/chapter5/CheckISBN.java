package chapter5;

import java.util.Scanner;

public class CheckISBN {

	public static void main(String[] args) {
		
		// Prompt user for 9 first ISBN digit
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer : ");
		int nineDigit = input.nextInt();
		input.close();
		int divisor = 100000000, checksum = 0;
		System.out.print("The ISBN-10 number is ");
		for(int i = 1; i < 10; i++) {
			int digit = (nineDigit / divisor) % 10;
			divisor /= 10;
			checksum += digit * i;
			System.out.print(digit);
		}
		checksum = checksum % 11;
		if(checksum == 10 )
			System.out.print("X");
		else 
			System.out.print(checksum);
	}

}
