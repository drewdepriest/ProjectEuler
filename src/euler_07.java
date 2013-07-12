

public class euler_07 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #07
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		
		// number of primes to find
		int findPrimes = 10001;
		
		// counter to track the primes
		int countPrimes = 0;
		
		// variable to hold the prime for which we seek
		int magicPrime = 0;

			// start counting at i=2 (don't count 1 as a prime)
			for(int i=2;;i++)
			{
				if(checkPrime(i))
				{
					countPrimes = countPrimes + 1;
					System.out.println(i + " IS PRIME!");
					
					// if this is the nth prime to be found, stop searching
					if(countPrimes == findPrimes)
					{
						magicPrime = i;
						System.out.println("The magic prime is: " + magicPrime);
						break;
					}
				}
				else
				{
					System.out.println(i + " is not prime.");
				}
				
				
			} // close nested FOR
		
	} // close MAIN

	static boolean checkPrime(int checkMe) {
		
		// only need to check factors < the square root of supposed prime number, plus 1
		int k=(int) Math.sqrt(checkMe);
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
