package chapter5;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value : ");
		int decimal = input.nextInt();
		String binary = "";
		
		for(int i = decimal; i >= 1; i = i / 2 ) {
			binary = (i % 2) + binary ;
		}
		System.out.println(binary);
		
	}

}
