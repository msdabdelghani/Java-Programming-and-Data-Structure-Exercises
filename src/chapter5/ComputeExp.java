package chapter5;

public class ComputeExp {

	public static void main(String[] args) {
		
		double e = 1, item = 1;
		for(int i = 1; i <= 20 ; i++) {
			item = (1.0) * (item / i);
			e = e + item;
			System.out.println("e = " + e);
		}
		
	}

}
