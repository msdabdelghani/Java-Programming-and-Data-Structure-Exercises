package chapter7;

import java.util.Scanner;

public class AnalyseNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of inputs : ");
		int length = input.nextInt();
		double sum = 0;
		
		double[] numbers = new double[length];
		

		System.out.print("Enter numbers : ");
		for(int i = 0; i < length; i++) {
			numbers[i] = input.nextDouble(); 
			sum += numbers[i];
		}
		
		double average = sum / length;
		int count = 0;
		
		for(double number: numbers){
			if(number > average) count++;
		}
		
		System.out.println("Average is : " + average);
		System.out.println("The number of elements greater than average is : " + count);

	}

}
