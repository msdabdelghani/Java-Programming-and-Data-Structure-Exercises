package chapter4;

import java.util.Scanner;

public class OrderThreeCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three cities
		System.out.print("Enter the first city : ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the second city : ");
		String city2 = input.nextLine();
		
		System.out.print("Enter the third city : ");
		String city3 = input.nextLine();
		
		// Compare the cities and print them out in alphabetical order
		if(city1.compareTo(city2) <= 0) { 
			if(city2.compareTo(city3) <= 0){
				// city1 <= city2 <= city3
			System.out.println("The cities in alphabetical order are : " + city1 + " " + city2 + " " + city3);
			}else if (city1.compareTo(city3) <= 0){
				// city1 <= city3 < city2
				System.out.println("The cities in alphabetical order are : " + city1 + " " + city3 + " " + city2);
			}else {
				// city3 < city1 <= city2
				System.out.println("The cities in alphabetical order are : " + city3 + " " + city1 + " " + city2);
			}	
		}else if(city1.compareTo(city3) <= 0) {
			// city2 < city1 <= city3
			System.out.println("The cities in alphabetical order are : " + city2 + " " + city1 + " " + city3);
		}else {
			// city2 < city3 < city1
			System.out.println("The cities in alphabetical order are : " + city2 + " " + city3 + " " + city1);
		}
	}

}
