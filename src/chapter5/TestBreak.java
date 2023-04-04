package chapter5;

public class TestBreak {

	public static void main(String[] args) {
		// Test Break Keyword inside loop
		
		int n = 0;
		int sum = 0;
		
		while( n < 20) {
			n++;
			sum += n;
			if(sum >= 100) 
				break;
		}
		
		System.out.println("The number is : " + n);
		System.out.println("The sum is : " + sum);
	}

}
