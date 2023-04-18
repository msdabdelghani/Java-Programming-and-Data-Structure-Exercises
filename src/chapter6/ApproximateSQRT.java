package chapter6;

import java.util.Scanner;

public class ApproximateSQRT {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a postive number : ");
		long number = input.nextLong();
		System.out.println("The square root is " + sqrt(number));
	}
	
	// Find the square root of the value
	  public static double sqrt(double num) {
	    double nextGuess = 1.0;
	    double lastGuess;

	    do {
	      lastGuess = nextGuess;
	      nextGuess = (lastGuess + (num / lastGuess)) * 0.5;
	    } 
	    while (Math.abs(nextGuess - lastGuess) >= 0.00001);

	    return nextGuess;
	  }
}
