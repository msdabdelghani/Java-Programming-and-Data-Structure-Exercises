package chapter6;

public class Emirp {
	
	public static void main(String args[]) {
		int count = 0;
		int number = 1;
		
		while(count < 100) {
			if(isEmirp(number)) {
				System.out.print(number + " ");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}
	}
	
	public static boolean isEmirp(int number) {
		int reversedNumber = PalindromeInteger.reverse(number);
		boolean isNumberPalindrome = PalindromeInteger.isPalindrome(number);
		boolean isNumberPrime = PalindromicPrime.isPrime(number);
		boolean isReversedNumberPrime = PalindromicPrime.isPrime(reversedNumber);
		
		return isNumberPrime && isReversedNumberPrime && !isNumberPalindrome;
	}
}
