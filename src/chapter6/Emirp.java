package chapter6;

public class Emirp {
	
	public static boolean isEmirp(int number) {
		int reversedNumber = PalindromeInteger.reverse(number);
		boolean isNumberPalindrome = PalindromeInteger.isPalindrome(number);
		boolean isNumberPrime = PalindromicPrime.isPrime(number);
		boolean isReversedNumberPrime = PalindromicPrime.isPrime(reversedNumber);
		
		return isNumberPrime && isReversedNumberPrime && !isNumberPalindrome;
	}
}
