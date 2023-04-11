package chapter5;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value : ");
		int decimal = input.nextInt();
		String octal = "";
		
		for(int i = decimal; i >= 1; i = i / 8 ) {
			octal = (i % 8) + octal ;
		}
		System.out.print("The octal value is : ");
		System.out.println(octal);
		
	}
}
