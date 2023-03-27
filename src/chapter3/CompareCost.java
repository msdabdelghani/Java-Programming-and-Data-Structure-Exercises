package chapter3;

import java.util.Scanner;

public class CompareCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price of the first product : ");
		double w1 = input.nextDouble();
		double p1 = input.nextDouble();
		
		System.out.print("Enter weight and price of the second product : ");
		double w2 = input.nextDouble();
		double p2 = input.nextDouble();
		
		double r1 = p1/w1;
		double r2 = p2/w2;
		
		if( r1 < r2 )
			System.out.println("Package 1 has a better price.");
		else if ( r1 > r2 )
			System.out.println("Package 2 has a better price.");
		else 
			System.out.println("Two packages have the same price.");
	}

}
