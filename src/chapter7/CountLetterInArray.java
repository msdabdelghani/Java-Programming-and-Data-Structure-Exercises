package chapter7;

public class CountLetterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = new char[100];
		int[] counts = new int[26];
		char letter = 'a';
		int count = 0;
		for(int i = 0; i < 100; i++) {
			chars[i] = chapter6.RandomCharacter.getRandomLowerCaseLetter();
		}
		for(int i = 0; i < 26; i++) {
			for(char charVar : chars) {
				if(charVar == letter) count++;
			}
			counts[i] = count;
			System.out.println("The number of " + letter + "'s is " + counts[i] );
			letter = (char)(letter + 1);
			count = 0;
		}
		
	}

}
