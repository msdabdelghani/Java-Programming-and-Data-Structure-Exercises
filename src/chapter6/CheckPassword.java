package chapter6;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password : ");
		String password = input.nextLine();
		System.out.println(isValid(password) ? "Valid Password": "Invalid Password");
	}
	
	public static boolean isValid(String password){
		int countDigit = 0;
		for(int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(!(Character.isDigit(ch) || Character.isLetter(ch))) {
				return false;
			}
			else if(Character.isDigit(ch))
				countDigit++;
		}
		if(password.length() < 8 || countDigit < 2)
			return false;
		return true;
	}
}	
