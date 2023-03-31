package chapter4;

public class RandomCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = (char) ('A' + Math.random() * 26);
		System.out.println("A random uppercase letter is : " + ch);
	}

}
