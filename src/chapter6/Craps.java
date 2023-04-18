package chapter6;

public class Craps {

	public static void main(String[] args) {
		rollDices();
		
	}
	
	public static void rollDices() {
		int number1 = (int)(Math.random() * 6) + 1;
		int number2 = (int)(Math.random() * 6) + 1;

		int sum = number1 + number2;
		int point = sum;
		
		if( sum == 2 || sum == 3 || sum == 12 ) {
			System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
			System.out.println("You lose");
		}
			
		else if ( sum == 7 || sum == 11) {
			System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
			System.out.println("You win");
		}
		else {
			System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
			System.out.println("point is " + point);
			do {
				number1 = (int)(Math.random() * 7);
				number2 = (int)(Math.random() * 7);
				sum = number1 + number2;
				if(sum == 7) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("You lose");
				}else if(sum == point) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("You win");
				}
			}while(sum != point && sum != 7);
		}
	}
}
