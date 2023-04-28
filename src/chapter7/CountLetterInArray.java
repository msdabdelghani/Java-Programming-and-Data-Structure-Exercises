package chapter7;

public class CountLetterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = new char[100];
		int[] counts = new int[26];
		char letter = 'a';
		for(int i = 0; i < chars.length; i++) {
			chars[i] = chapter6.RandomCharacter.getRandomLowerCaseLetter();
		}
		for(int i = 0; i < chars.length; i++) {
				counts[chars[i] - 'a']++;
		}
		for(int count: counts) {
			System.out.println("The number of " + letter + "'s is " + count );
			letter = (char)(letter + 1);
		}
	}
		
}


