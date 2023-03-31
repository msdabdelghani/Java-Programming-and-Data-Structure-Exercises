package chapter4;

import java.util.Scanner;

public class CheckSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter SSN : ");
		String ssn = input.nextLine();
		
		if(		Character.isDigit(ssn.charAt(0)) &&
				Character.isDigit(ssn.charAt(1)) &&
				Character.isDigit(ssn.charAt(2)) &&
				Character.isDigit(ssn.charAt(4)) &&
				Character.isDigit(ssn.charAt(5)) &&
				Character.isDigit(ssn.charAt(7)) &&
				Character.isDigit(ssn.charAt(8)) &&
				Character.isDigit(ssn.charAt(9)) &&
				Character.isDigit(ssn.charAt(10)) &&
				ssn.charAt(3) == '-' &&
				ssn.charAt(6) == '-')
			System.out.println(ssn + " is a valid social security number");
		else
			System.out.println(ssn + " is an invalid social security number");
			
	}

}
