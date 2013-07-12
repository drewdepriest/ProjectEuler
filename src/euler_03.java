

public class euler_03 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #03
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {

		// This is the number to factor
		long factorMe = 600851475143L;
		
		m = (int) Math.sqrt(factorMe);
		
		// Variable to track the largest factor
		int largeFactor = 1;

		for(int i=2;i<factorMe/2;i++)
		{
				// If number mod i equals zero, it's a factor of factorMe
				if(factorMe%i == 0)
				{			
					// Check if prime
					if(checkPrime(i) && i > largeFactor)
					{
						// Check if i greater than previous prime factor
						largeFactor = i;
						System.out.println(largeFactor + " is the largest prime factor!");

					
					}
					
					
				}	
		} // close FOR loop
				
	} // close MAIN

		private static boolean checkPrime(int checkMe) {
			int j;
			int k=(int) Math.sqrt(checkMe);
			for(j=2;j<k;j++)
			{
				if(checkMe%j == 0)
				{
					return false;
				}
			}
			return true;
	
		} // close checkPrime	
		
	} // close CLASS
