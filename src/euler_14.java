//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_14 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #14
	 * The following iterative sequence is defined for the set of positive integers:
	 * 
	 * n = n/2 (n is even)
	 * n = 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following sequence:
	 * 13  40  20  10  5  16  8  4  2  1
	 * 
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 * 
	 * Which starting number, under one million, produces the longest chain?
	 */
	public static void main(String[] args) {
		
		long capNum = 1000000;
		long findChain = 0;
		long biggestChain = 0;
		long biggestVal = 0;
		
		for(int i=2;i<capNum;i++)
		{
			findChain = collatz(i);
			if(findChain > biggestChain)
			{
				biggestChain = findChain;
				biggestVal = i;
			}
			
		}
		
		System.out.println("The biggest chain of " + biggestChain + " terms occurs for i equals " + biggestVal + ".");
		
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
		
} // close CLASS
