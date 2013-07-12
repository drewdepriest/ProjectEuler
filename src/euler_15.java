//import java.math.BigInteger;

//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_15 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #15
	 * Starting in the top left corner of a 2x2 grid, there are 6 routes (without backtracking) to the bottom right corner.
	 * 
	 * How many routes are there through a 20x20 grid?
	 */
	public static void main(String[] args) {
		
		
		/*  Sketching this out, the number of paths corresponds to the sum of Pascal's triangle:
		 * 	(if you start at the lower right corner and work back up and to the left, the solution becomes clear.
		 * 				
		 * 						 1
		 * 			           1   1
		 * 				     1   2   1 			for n=1, there are 2 paths
		 *                 1   3   3   1		for n=2, there are 6 paths
		 *               1   4   6   4   1		for n=3, there are 20 paths
		 *             1   5   10  10  5   1	for n=4, there are 70 paths
		 *             
		 *             The answer, thus, lies at the midpoint of the string of the n+1 row
		 */

			// numMatrix is the length of one side of the matrix given in the problem
			long numMatrix = 20;
			
			// double the numMatrix value to get the exact row of Pascal's Triangle necessary for this problem
			long n = numMatrix + numMatrix;
			
			long[] pascalRow = new long[0];
			
			// build the rows out to n+1
			for(int i=0;i<n+1;i++)
			{
				pascalRow = pascalRow(pascalRow);
			}
			
			long[] finalRow = new long[pascalRow.length]; 

			// now print the terms of the row and copy to a new int[] to print later
			for(int j=0;j<pascalRow.length;j++) 
			{
	            System.out.println(pascalRow[j]+" ");
	            finalRow[j] = pascalRow[j];
			}
			
			// the mid point of the final row is the solution to the challenge
			long midPoint = (finalRow[finalRow.length/2]);
			
			System.out.println("In a " + numMatrix + "x" + numMatrix + " grid, there are " + midPoint + " routes.");
		
	} // close MAIN
	
	// helper functions
	static boolean checkPrime(int checkMe) {
		
		// only need to check factors < the square root of supposed prime number, plus 1
		long k=(int) Math.sqrt(checkMe);
		k = k+1;
		
		for(int j=2;j<k;j++)
		{
			if(checkMe%j == 0)
			{
				return false;
			} 
		} // close FOR
		
			return true;

	} // close checkPrime
	
	static boolean checkFactor(int bigNum, int possFactor ) {
		
		if(bigNum%possFactor == 0)
		{
			return true;
		}
		
		return false;
		
	} // close checkFactor
	
	static long collatz(int d)
	{
		long count = 0; 
		long tempInt = d;
		do {
			// if even, the next term is set to n/2 
            if(tempInt%2==0)
            {
            	tempInt = (tempInt/2);
            }
            // if odd, the next term is set to (3n+1)
            else if(tempInt%2==1 && tempInt!=1)
            {
            	tempInt = (3*tempInt)+1;
            }
			
            count++;
            //System.out.println("Count is: " + count);
            
            // once the Collatz number hits 1, end the sequence
        } while (tempInt != 1);
		
		// must add 1 to the last case in order to account for the number 1
		return count+1;
	}
	
	static long[] pascalRow(long[] lastRow) {
		
		long[] tempRow = new long[lastRow.length + 1];
		tempRow[0] = 1;
		tempRow[tempRow.length-1] = 1;
		
		for(int k=1;k<tempRow.length-1;k++)
		{
			tempRow[k] = lastRow[k-1] + lastRow[k];			
		}
		
		return tempRow;
		
	} // close pascalRow

		
} // close CLASS
