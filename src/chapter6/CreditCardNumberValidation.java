package chapter6;

public class CreditCardNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4388576018402626 : " + sumOfOddPlace(4388576018402626L));
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		return true;
	}
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		return 1;
	}
	/** Return this number if it is a single digit, otherwise,
	 return the sum of the two digits */
	public static int getDigit(int number) {
		return number;
	}
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String str = number + "";
		for(int i = getSize(number) - 1; i >= 0; i = i -2) {
			sum += str.charAt(i) - '0';
		}
		return sum;
	}
	/** Return true if the number d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		String strN = number + "";
		String strD = d + "";
		return strN.startsWith(strD);
	}
	/** Return the number of digits in d */
	public static int getSize(long d) {
		String str = d + "";
		return str.length();
	}
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		String str = number + "";
		if(str.length() < k) 
			return number;
		else 
			return Long.parseLong(str.substring(0, k));
	}

}