

public class euler_06 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #06
	 * The sum of the squares of the first ten natural numbers is,
	 * 12 + 22 + ... + 102 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		
		int sumSquare = 0;
		int squareSum = 0;
		int diff = 0;
		
		for(int i=1;i<101;i++)
		{
			sumSquare = sumSquare + (i*i);
			squareSum = squareSum + i;
		}
		
		squareSum = squareSum*squareSum;
		diff = squareSum - sumSquare;
		System.out.println("The difference between the sum of the squares is " + diff);
		
	} // close MAIN

	
		
} // close CLASS
