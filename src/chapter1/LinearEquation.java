package chapter1;

public class LinearEquation {

	public static void main(String[] args) {
		/* Solving the  2x2 linear equation : 
		 * 3.4x + 50.2y = 44.5
		 * 2.1x + .55y = 5.9 
		*/
		System.out.print("x = ");
		System.out.println((44.5 * 0.55 - 5.9 * 50.2) / (3.4 * 0.55 - 2.1 * 50.2));
		System.out.print("y = ");
		System.out.println((3.4 * 5.9 - 2.1 * 44.5) / (3.4 * 0.55 - 2.1 * 50.2));
		
	}

}
