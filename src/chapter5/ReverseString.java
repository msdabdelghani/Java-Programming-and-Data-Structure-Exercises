package chapter5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String str = input.nextLine();
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			newStr = str.charAt(i) + newStr;
		}
		
		System.out.println("The reversed string is " + newStr);
		
	}

}
