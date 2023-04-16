package chapter6;

public class SortThreeNumbers {

	public static void main(String[] args) {
		displaySortedNumbers(9,4,7);

	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if(num1 >= num2) {
			if(num2 >= num3)
				System.out.println("The increasing order is : " + num3 + " " + num2 + " " + num1);
			else if(num1 >= num3)
				System.out.println("The increasing order is : " + num2 + " " + num3 + " " + num1);
			else
				System.out.println("The increasing order is : " + num2 + " " + num1 + " " + num3);
		}
		else {
			if(num1 >= num3) 
				System.out.println("The increasing order is : " + num3 + " " + num1 + " " + num2);
			else if(num2 >= num3)
				System.out.println("The increasing order is : " + num1 + " " + num3 + " " + num2);
			else
				System.out.println("The increasing order is : " + num1 + " " + num2 + " " + num3);
		}
	}
}
