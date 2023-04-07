package chapter5;

import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two digit number: ");
		int n = input.nextInt();
		input.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i ; j++)
				System.out.print("   ");
			int valueBefore = i + 1;
			for(int j = n-i; j < n + 1; j++) {
				if(valueBefore < 10)
					System.out.print(valueBefore-- + "  ");
				else
					System.out.print(valueBefore-- + " ");
			}
			int valueAfter = 2;
			for(int j = n + 1; j < n + i + 1; j++) {
				if(valueBefore < 10)
					System.out.print(valueAfter++ + "  ");
				else
					System.out.print(valueAfter++ + " ");
			}
			for(int j = n + i + 1; j < 2 * n -1; j++) 
				System.out.print("   ");
			System.out.println();
		}
	}
}


