package chapter5;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int gcd = 1, k = 1;
		System.out.print("Enter first number : ");
		int n1 = input.nextInt();
		System.out.print("Enter second number : ");
		int n2 = input.nextInt();
		while(k <= n1 && k <= n2) {
			if((n1 % k == 0) && (n2 % k == 0)) 
				gcd = k;
			k++;
		}
		System.out.println("The Greatest common divisor of " + n1 + " and " + n2 + " is " + gcd);
		
	}

}
