package chapter4;

public class VehiculePlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Lincence plate is : %c%c%c%04d",
							(char)('A' + Math.random() * 26), 
							(char)('A' + Math.random() * 26),
							(char)('A' + Math.random() * 26),
							(int)(Math.random()*10000));
	}
}
