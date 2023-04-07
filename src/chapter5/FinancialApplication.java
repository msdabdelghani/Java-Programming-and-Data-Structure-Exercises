package chapter5;

public class FinancialApplication {

	public static void main(String[] args) {
		// compute future tuition
		int tuition = 10000;
		int tuitionIncrease = 0;
		int tuitionCost = 0;
		
		for(int i=1; i <= 14; i++) {
			if(i <= 10) {
				tuitionIncrease = tuition * 5 / 100;
				System.out.println("Tuition increase for the year " + i +" = 5% of "+ tuition + " = " + tuitionIncrease);
				System.out.println("Tuition for the year " + i +" = " + tuition + " + " + " tuitionIncrease " + " = " + (tuition + tuitionIncrease) );
			}else {
				tuitionCost += tuition; 
			}
			tuition += tuitionIncrease; 
		}
		
		System.out.println("Cost of Tuition after 10 years is : " + tuitionCost);
	}

}
