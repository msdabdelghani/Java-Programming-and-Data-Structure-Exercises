package chapter5;

import java.util.Scanner;

public class CountPositiveNegative {  
	  public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
		int i = 0;
		int positives = 0;
		int negatives = 0;
		int sum = 0;
		int number;
		do {
			System.out.print("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();
			if(number > 0) 
				positives++;
			else if(number < 0)
				negatives++;
			sum += number;
		}while(number != 0);
	    
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		if(negatives + positives == 0) 
			System.out.println("The average is 0");
		else
		System.out.println("The average is " + 1.0 * sum/(positives + negatives));
	  }
	}
