package chapter3;

import java.util.Scanner;

public class CheckISBN10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Prompt user for 9 first ISBN digit
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int nineDigit = input.nextInt();

		// Get each digit from the first to the 9th
		int d9 = (nineDigit % 10);
		int d8 = (nineDigit / 10) % 10;
		int d7 = (nineDigit / 100) % 10;
		int d6 = (nineDigit / 1000) % 10;
		int d5 = (nineDigit / 10000) % 10;
		int d4 = (nineDigit / 100000) % 10;
		int d3 = (nineDigit / 1000000) % 10;
		int d2 = (nineDigit / 10000000) % 10;
		int d1 = (nineDigit / 100000000) % 10;
		
		// Calculate ISBN-10 Checksum
		int checksum =  ( d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9 ) % 11;
		
		//Display ISBN-10
		 
		System.out.print("The ISBN-10 number is ");
		System.out.print(d1);
		System.out.print(d2);
		System.out.print(d3);
		System.out.print(d4);
		System.out.print(d5);
		System.out.print(d6);
		System.out.print(d7);
		System.out.print(d8);
		System.out.print(d9);
		if(checksum == 10 )
			System.out.print("X");
		else 
			System.out.print(checksum);
		
	}

}
