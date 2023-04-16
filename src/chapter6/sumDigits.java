package chapter6;

public class sumDigits {

	public static void main(String[] args) {
		System.out.println("the sum of digits of : 234 is " + sumDigits(234));

	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

}
