package chapter5;

public class CancellationError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rightToLeftSum = 0;
		double leftToRightSum = 0;
		for(int i=1; i <= 50000; i++) {
			leftToRightSum += 1.0/i;
		}
		for(int i=50000; i > 0; i--) {
			rightToLeftSum += 1.0/i;
		}
		
		System.out.println("The sum from left to right is : " + leftToRightSum);
		System.out.println("The sum from right to left is : " + rightToLeftSum);
	}

}
