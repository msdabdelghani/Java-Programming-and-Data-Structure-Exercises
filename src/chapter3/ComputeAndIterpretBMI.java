package chapter3;

import java.util.Scanner;

public class ComputeAndIterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		// Prompt the user to enter height in feet and inches
		System.out.print("Enter feet: ");
		int feet = input.nextInt();
		
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
		double bmi = weightInKilograms /
		(heightInMeters * heightInMeters);
		
		// Display result
		System.out.println("BMI is " + (int)(bmi * 100) / 100.0);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}

