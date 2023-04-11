package chapter5;

import java.util.Scanner;

public class OccurencesOfMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers : ");
		int number= input.nextInt();
		if(number == 0)
			System.out.println("No numbers are entered except 0");
		int max = number;
		int count = 1;
		while(number != 0) {
			number= input.nextInt();
			if(max < number) {
				max = number;
				count = 1;
			}else if(max == number) {
				count++;
			}
		}
		System.out.println("The largest number is : " + max);
		System.out.println("The occurrence count of the largest number is : " + count);
	}

}
