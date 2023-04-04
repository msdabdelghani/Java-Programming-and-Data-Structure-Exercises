package chapter5;

import java.util.Scanner;

public class Palindrome {
 
	public static void main(String[] args) {
		// Given a word, check if it's Palindrome
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = input.nextLine();
		int start = 0;
		int end = word.length()-1;
		System.out.println(word);
		while(start <= end) {
			if(word.charAt(start) != word.charAt(end)) 
				break;
			start++;
			end--;
		}
		System.out.println("out");
		if(start <= end) 
			System.out.println(word + " is not a palindrome");
		else
			System.out.println(word + " is a palindrome");

	}

}
