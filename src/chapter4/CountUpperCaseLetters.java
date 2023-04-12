package chapter4;

import java.util.Scanner;

public class CountUpperCaseLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int uppercases = 0;
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercases++;
			}
		}
		System.out.println("The number of uppercase letters is " + uppercases);
	}
}
