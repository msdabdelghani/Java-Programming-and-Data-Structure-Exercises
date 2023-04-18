package chapter6;

public class PalindromicPrime {

	public static void main(String[] args) {
		printPalindromicPrimes();
	}
	
	public static void printPalindromicPrimes() {
		int count = 0;
		int number = 1;
		
		while(count < 100) {
			if(isPrime(number) && PalindromeInteger.isPalindrome(number)) {
				System.out.print(number + " ");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
