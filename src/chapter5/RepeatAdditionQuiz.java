package chapter5;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();
		
		while(answer != number1 + number2) {
			System.out.print("Wrong answer. Try Again. " + "What is " + number1 + " + " + number2 + " ? ");
			answer = input.nextInt();
		}
		System.out.println("You got it.");
	}

}
