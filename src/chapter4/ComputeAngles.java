package chapter4;

import java.util.Scanner;

public class ComputeAngles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Prompt User to enter three points
		System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Compute three sides
		
		double a = Math.sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));
		double b = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
		double c = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		
		// Compute three angles
		
		double A = Math.toDegrees(Math.acos((Math.pow(a, 2) - Math.pow(b, 2) -Math.pow(c, 2)) / (-2*b*c)));
		double B = Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) -Math.pow(c, 2)) / (-2*a*c)));
		double C = Math.toDegrees(Math.acos((Math.pow(c, 2) - Math.pow(a, 2) -Math.pow(b, 2)) / (-2*a*b)));
		
		// Display results 
		
		System.out.println("A =" + Math.round(A * 100) / 100.0);
		System.out.println("B = "+ Math.round(B * 100) / 100.0);
		System.out.println("C = "+ Math.round(C * 100) / 100.0);
		
	}

}
