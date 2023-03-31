package chapter4;

import java.util.Scanner;

public class StudentMajorStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter two characters : ");
		String str = input.nextLine();
		String major = null;
		String status = null;
		switch (str.charAt(0)) {
	        case 'M':
	            major = "Mathematics";
	            break;
	        case 'C':
	            major = "Computer Science";
	            break;
	        case 'I':
	            major = "Information Technology";
	            break;
	        default:
	            System.out.println("Invalid input");
	            System.exit(1);
		}
		switch (str.charAt(1)) {
	        case '1':
	            status = "Freshman";
	            break;
	        case '2':
	            status = "Sophomore";
	            break;
	        case '3':
	            status = "Junior";
	            break;
	        case '4':
	            status = "Senior";
	            break;
	        default:
	            System.out.println("Invalid input");
	            System.exit(1);
		}
			
		System.out.println(major + " " + status);
	}

}
