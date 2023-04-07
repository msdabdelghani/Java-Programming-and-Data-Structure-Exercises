package chapter5;

public class SumOfSeries {

	public static void main(String[] args) {
		double sum = 0;
		for(int i = 3; i < 100; i=i+2) {
			sum += (i-2.0)/i;
		}
		System.out.println("The sum of the series " + sum);
	}

}
