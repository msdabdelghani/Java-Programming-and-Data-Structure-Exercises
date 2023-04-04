package chapter5;

public class TestContinue {

	public static void main(String[] args) {
		// Test Continue Keyword 
		int n = 0;
		int sum = 0;
		
		while(n < 20) {
			n++;
			if(n == 10 || n == 11) {
				continue;
			}
			sum += n;
		}
		
		System.out.println("The sum is " + sum);
	}

}
