package chapter6;

public class TestPassByValue {

	public static void main(String[] args) {
		int x = 1;
		increment(x);
		System.out.println("After calling the method x is : " + x);
	}
	
	public static void increment(int n) {
		n++;
		System.out.println("Inside the method n is : " + n);
	}

}
