package chapter4;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vowels = 0, consonants = 0;
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		for( int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c)) {
				c = Character.toUpperCase(c);
				switch(c) {
					case 'A' : 
					case 'E' :
					case 'U' :
					case 'I' :
					case 'O' :
						vowels++;
						break;
					default : 
						consonants++;
						break;
				}
			}
		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
	}

}
