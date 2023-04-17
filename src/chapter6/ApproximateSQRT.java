package chapter6;

public class ApproximateSQRT {
	public static void main(String[] args) {
		
	}
	
	public static double sqrt(long n) {
		long lastGuess = (long)(Math.random()* (n+1));
		long nextGuess;
		while(true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if(Math.abs(nextGuess - lastGuess) <= 0.0001) {
				return nextGuess;
			}else {
				nextGuess = lastGuess;
				if(Math.abs(nextGuess - lastGuess) <= 0.0001) {
					return nextGuess;
				}
			}
		}
	}
}
