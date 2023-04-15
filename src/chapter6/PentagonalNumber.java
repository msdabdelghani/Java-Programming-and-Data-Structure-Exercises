package chapter6;

public class PentagonalNumber {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if((i + 1) % 10 == 0) {
				System.out.printf("%7d", getPentagonalNumber(i) );
				System.out.println();
			}
			else {
				System.out.printf("%7d", getPentagonalNumber(i) );
			}
		}

	}
	
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}

}
