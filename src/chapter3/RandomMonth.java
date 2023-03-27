package chapter3;

public class RandomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generates an integer between 1 and 12 and 
		
		int month = (int)(Math.random() * 12 ) + 1;
		
		//displays the English month names for the number
		
		switch(month) {
		
			case 1 : System.out.println("The month name for " + month + " is January");
		     break;
			case 2 : System.out.println("The month name for " + month + " is February");
			 break;
			case 3 : System.out.println("The month name for " + month + " is March");
			 break;
			case 4 : System.out.println("The month name for " + month + " is April");
			 break;
			case 5 : System.out.println("The month name for " + month + " is May");
			 break;
			case 6 : System.out.println("The month name for " + month + " is June");
			 break;
			case 7 : System.out.println("The month name for " + month + " is July");
			 break;
			case 8 : System.out.println("The month name for " + month + " is August");
			 break;
			case 9 : System.out.println("The month name for " + month + " is September");
			 break;
			case 10 : System.out.println("The month name for " + month + " is October");
			 break;
			case 11 : System.out.println("The month name for " + month + " is November");
			 break;
			default : System.out.println("The month name for " + month + " is December");
			 break;
							 
		}
	}

}
