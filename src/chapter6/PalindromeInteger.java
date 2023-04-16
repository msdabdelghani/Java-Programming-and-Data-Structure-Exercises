package chapter6;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1210121));
	}
	
	public static int reverse(int number) {
		int reversed = 0, digit = 0;
		digit = number % 10;
		number = number / 10;
		reversed += digit;
		while(number > 0) {
			digit = number % 10;
			number = number / 10;
			reversed = reversed * 10;
			reversed += digit;
		}
		return reversed;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
	

}
