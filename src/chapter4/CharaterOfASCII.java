package chapter4;

import java.util.Scanner;

public class CharaterOfASCII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code : ");
		int ascii = input.nextInt();
		if(ascii < 0 || ascii > 127) 
			System.out.println("Invalid ASCII code");
		else 
			System.out.println("The character for ASCII code " + ascii + " is " + (char)ascii);	
	}
}
