package chapter5;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int data;
		int sum = 0;
		do {
			System.out.print("Enter an integer (the input ends when it is 0) : ");
			data = input.nextInt();
			sum += data;
		}while(data != 0);
		
		System.out.println("The sum is : " + sum );
	}	

}
