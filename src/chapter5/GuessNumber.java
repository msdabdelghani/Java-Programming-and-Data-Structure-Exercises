package chapter5;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a number between 0 and 100 : ");
		int random = (int)(Math.random()*101);
		int guess = input.nextInt();
		while(guess != random) {
			if(guess > random) {
				System.out.println("Your guess is too high");
			}else {
				System.out.println("Your guess is too low");
			}
			System.out.print("Guess a number between 0 and 100 : ");
			guess = input.nextInt();
		}
		System.out.println("Your guess is correct");
	}

}
