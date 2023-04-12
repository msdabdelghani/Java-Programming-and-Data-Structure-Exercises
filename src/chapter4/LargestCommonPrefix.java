package chapter4;

import java.util.Scanner;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int uppercases = 0;
		System.out.print("Enter your first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter your second string: ");
		String str2 = input.nextLine();
		int n = str1.length() > str2.length() ? str1.length() : str2.length();
		String longestCommonPrefix = "";
		for(int i = 0; i < n; i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				longestCommonPrefix += str1.charAt(i);
			}else {
				break;
			}
		}
		if(longestCommonPrefix.isEmpty()) {
			System.out.println(str1 + " and " + str2 + " have no common prefix");
		}else {
			System.out.println("The common prefix is " + longestCommonPrefix );
		}
		

	}

}
