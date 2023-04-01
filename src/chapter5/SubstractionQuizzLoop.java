package chapter5;

import java.util.Scanner;

public class SubstractionQuizzLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0, correctCount = 0;
		String output = "", result = "";
		long startTime = System.currentTimeMillis();
		System.out.println("Welcome to the Math Quiz!");
        System.out.println("-------------------------\n");
		while(i<5) {
			int num1 = (int)(Math.random()*10);
			int num2 = (int)(Math.random()*10);
			if(num2 > num1) {
				int temp = num2;
				num2 = num1;
				num1 = temp;
			}
			System.out.print("What is " + num1 + " - " + num2 + " : ");
			int attempt = input.nextInt();
			if(attempt == num1 - num2) {
				System.out.println("You are correct");
				correctCount++;
				result = "correct";
			}else {
				System.out.println("Your answer is wrong.");
				System.out.println(num1 + " - " + num2 + " Should be " + (num1 - num2));
				result = "wrong";
			}
			i++;
			output += "\n   " + num1 + " - " + num2 + " = " + (num1 - num2) + " " + result;
		}
		long endTime = System.currentTimeMillis();
		
		 System.out.println("\n-------------------------");
	        System.out.println("Quiz Summary:");
	        System.out.printf("   Time taken: %.1f seconds\n", (endTime - startTime) / 1000.0);
	        System.out.printf("   Correct answers: %d\n", correctCount);
		
		System.out.println(output);
	}
}
