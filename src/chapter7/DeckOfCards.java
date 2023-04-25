package chapter7;

public class DeckOfCards {

	public static void main(String[] args) {
		
		int[] deck = new int[52];
		String[] cardSuit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] rank = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;
		
		for (int i = deck.length - 1; i >= 0; i--) {
			int j = (int)(Math.random() * (i + 1));
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Card number " + deck[i] + " is the " + rank[deck[i] % 13] + " of " + cardSuit[deck[i] / 13]);
			
		}
	}

}
