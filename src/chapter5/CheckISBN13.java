package chapter5;

import java.util.Scanner;

public class CheckISBN13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String str = input.nextLine();
		int checksum = 0;
		if(str.length() != 12) {
			System.out.println(str + " is an invalid input");
			System.exit(0);
		}else {
			for(int i = 0; i < 12; i++) {
				if(Character.isDigit(str.charAt(i)) && (i % 2) == 0) {
					checksum += (int)str.charAt(i) - '0';
				}else if(Character.isDigit(str.charAt(i)) && (i % 2) != 0) {
					checksum += 3* ((int)str.charAt(i) - '0');
				}else {
					System.out.println(str + " is an invalid input");
					System.exit(0);;
				}
			}
			checksum = 10 - ( checksum % 10 );
			if(checksum == 10 )
				str = str + "0";
			else 
				str = str + checksum;
		}
		System.out.println("The ISBN-13 number is " + str);
	}

}
