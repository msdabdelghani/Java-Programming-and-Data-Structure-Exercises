package chapter4;

import java.util.Scanner;

public class UnicodeOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character : ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The unicode for the character " + ch + " is " + (int)ch);
	}

}
