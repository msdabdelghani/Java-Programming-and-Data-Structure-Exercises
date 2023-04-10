package chapter5;

import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int score = 0;
		
		while(Math.abs(score) != 2) {
			System.out.print("Enter your choice (0 : Scissor, 1: Rock, 2: Paper) : ");
			int userChoice = input.nextInt();
			int computerChoice = (int)(Math.random() * 3);
			if(userChoice == computerChoice) {
				System.out.println("Draw");
			}else if(userChoice == 0) {
				if(computerChoice == 1) {
					System.out.println("The computer is rock. You are scissor. Computer won");
					score += 1;
				}else {
					System.out.println("The computer is paper. You are scissor. You won");
					score -= 1;
				}
			}else if(userChoice == 1) {
				if(computerChoice == 0) {
					System.out.println("The computer is scissor. You are rock. You won");
					score -= 1; 
				}else {
					System.out.println("The computer is paper. You are rock. Computer won");
					score += 1; 
				}
			}else if(userChoice == 2) {
				if(computerChoice == 0) {
					System.out.println("The computer is scissor. You are paper. Computer won");
					score += 1; 
				}else {
					System.out.println("The computer is rock. You are paper. You won");
					score -= 1; 
				}
			}
			
		}
		
		if(score == 2) 
			System.out.println("Sorry, the computer won");
		else 
			System.out.println("Congratulations, you won");
			
	}
}


