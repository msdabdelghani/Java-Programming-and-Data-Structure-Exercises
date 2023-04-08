package chapter5;

public class ComputePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi;
		int k;
		for(int n = 10000; n <= 100000; n = n + 10000) {
			pi = 0;
			k = 1;
			for(int i = 1; i <= n; i++) {
				pi += (Math.pow(-1, i + 1) / k);
				k = k + 2;
			}
			pi = 4 * pi;
			System.out.println("For n = " + n + ", PI = " + pi);
		}
	}
}
