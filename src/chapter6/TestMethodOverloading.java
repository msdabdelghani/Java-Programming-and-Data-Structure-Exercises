package chapter6;

public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("The max value of 3 and 4 is " + max(3, 4));
		System.out.println("The max value of 3.0 and 4.1 is " + max(3.0, 4.1));
		System.out.println("The max value of 3.0 and 4.1 and 5.4 is " + max(3.0, 4.1, 5.4));
		
	}
	
	public static int max(int a, int b) {
		return a >= b ? a : b;
	}
	public static double max(double a, double b) {
		return a >= b ? a : b;
	}
	public static double max(double a, double b, double c) {
		return max(max(a, b), c);
	}

}
