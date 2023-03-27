package chapter3;

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first edge of triangle : ");
		double firstEdge = input.nextDouble();
		System.out.print("Enter second edge of triangle : ");
		double secondEdge = input.nextDouble();
		System.out.print("Enter third edge of triangle : ");
		double thirdEdge = input.nextDouble();
		
		boolean isTriangle = true;
		
		if(firstEdge + secondEdge <= thirdEdge) 
			isTriangle = false;
		else if (firstEdge + thirdEdge <= secondEdge)
			isTriangle = false;
		else if(secondEdge + thirdEdge <= firstEdge)
			isTriangle = false;
		
		if(isTriangle) 
			System.out.println("The Perimeter of the triangle is : " + (firstEdge + secondEdge + thirdEdge));
		else
			System.out.println("Invalid input");
		
	}

}
