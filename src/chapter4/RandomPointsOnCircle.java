package chapter4;

public class RandomPointsOnCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alpha1 = (int)(Math.random()* 2 * Math.PI * 100) / 100.0;
		double alpha2 = (int)(Math.random()* 2 * Math.PI * 100) / 100.0;
		double alpha3 = (int)(Math.random()* 2 * Math.PI * 100) / 100.0;
		
		final double r = 40;
		
		double x1 = r * Math.cos(alpha1);
		double y1 = r * Math.sin(alpha1);
		double x2 = r * Math.cos(alpha2);
		double y2 = r * Math.sin(alpha2);
		double x3 = r * Math.cos(alpha3);
		double y3 = r * Math.sin(alpha3);
		
		System.out.println("Three random points are ");
		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");
		System.out.println("(" + x3 + "," + y3 + ")");
		
	}

}
