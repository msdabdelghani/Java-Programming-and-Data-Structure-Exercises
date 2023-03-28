package chapter4;

public class CheckASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'T';
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is uppercase");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is lowercase");
		}else if(ch>='0' && ch<='9') {
			System.out.println(ch + " is a number");
		}
	}

}
