//import java.util.ArrayList;
//import java.util.List;



public class euler_10 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #10
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		
		long topEnd = 2000000L;
		long primeSum = 0;
		int countPrimes = 0;
		
		// start with 2, as we don't treat 1 as a prime (it's special)
		for(int i=2;i<topEnd+1;i++)
		{
			if(checkPrime(i))
			{
				//System.out.println("Found prime at " + i);
				countPrimes = countPrimes + 1;
				primeSum = primeSum + i;
			}
			
		} // close FOR
		
		System.out.println("Sum of primes below " + topEnd + " is " + primeSum);
		System.out.println("total primes: " + countPrimes);
		
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
		
} // close CLASS
