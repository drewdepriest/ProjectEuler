import java.math.BigInteger;

//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_16 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #16
	 * 2^15 = 32,768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 2^1000?
	 */
	
	public static void main(String[] args) {
	
		int numValues = 1000;
		int count=1;
		
		// have to use BigInts to calculate 2^1000
		BigInteger two = BigInteger.valueOf(2);
		BigInteger temp = BigInteger.ONE;
		
		while(count<numValues+1)
		{
			temp = temp.multiply(two);
			//System.out.println("for count equals " + count + " the value is " + temp);
			count++;
		}
		
		// convert the final value to a string
		String lastStr = temp.toString();
		
		// track the sum of the digits
		long sumDigits = 0;
		
		for(int i=0;i<lastStr.length();i++)
		{
			sumDigits = sumDigits + Character.getNumericValue(lastStr.charAt(i));
		}
		
		System.out.println("The sum of the digits for 2 to the power " + numValues + " equals " + sumDigits);
		
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
