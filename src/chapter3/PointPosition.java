package chapter3;

import java.util.Scanner;

public class PointPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three point positions : ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if(condition > 0) 
			System.out.println("p2 is on the left side of the line");
		else if (condition < 0)
			System.out.println("p2 is on the right side of the line");
		else 
			System.out.println("p2 is on the same line");
	}

}
