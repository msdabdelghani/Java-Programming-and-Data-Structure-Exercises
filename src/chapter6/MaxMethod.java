package chapter6;

public class MaxMethod {
	
	public static int Max(int a, int b) {
		return a >= b ? a : b;
	}

	public static void main(String[] args) {
		
		System.out.println("The max number of 33 and 64 is : " + Max(33, 64));
		
	}

}
