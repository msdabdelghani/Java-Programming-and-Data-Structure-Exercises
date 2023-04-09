package chapter5;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int divisorsSum = 0;
		for(int i = 1; i < 10000; i++) {
			for(int j = 1; j <= i/2; j++) {
				if(i % j == 0)
					divisorsSum += j;
			}
			if(i == divisorsSum) {
				System.out.println(i + " is a Perfect Number");
			}
			divisorsSum = 0;
		}
	}
	
}
