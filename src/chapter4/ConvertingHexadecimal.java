package chapter4;

import java.util.Scanner;

public class ConvertingHexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Hexadecimal Digit : ");
		String hexString = input.nextLine();
		if (hexString.length() != 1) {
		 System.out.println("You must enter exactly one character");
		 System.exit(1);
		}	
		char ch = hexString.charAt(0);
		int decimal=0;
		if(ch >= 'A' && ch <= 'F') {
			decimal += ch - 'A' + 10;
		}else if(ch >= '0' && ch <= '9') {
			decimal += ch - '0';
		}else {
			System.out.println("Invalid Hexadecimal");
			System.exit(0);
		}
		
		System.out.println("The decimal number is : " + decimal);
		
	}
}
