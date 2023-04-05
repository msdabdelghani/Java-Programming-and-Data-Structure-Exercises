package chapter5;

public class PrimeNumber {

	public static void main(String[] args) {
		// List the first 50 prime numbers each 10 in a line
		
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_LINE = 10;
		int number = 2;
		int count = 0;
		
		while(count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			for(int i=2; i <= number/2; i++) {
				if(number % i == 0)
					isPrime = false;
			}
			if(isPrime) {
				count++;
				if( count % NUMBER_OF_LINE == 0) 
					System.out.println(number);
				else 
					System.out.print(number + " ");
			}	
			number++;
		}

	}

}
