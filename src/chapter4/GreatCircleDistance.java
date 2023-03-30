package chapter4;

import java.util.Scanner;

public class GreatCircleDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The latitude and longitude degrees are for north and west. Use negative to indicate south and east degrees.");
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		final double radius = 6_371.01;
		double distance = radius * (Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) 
						+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))));
		System.out.println("The distance between the two points is " + distance + " km");
	}
}
