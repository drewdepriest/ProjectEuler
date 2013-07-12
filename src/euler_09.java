//import java.util.ArrayList;
//import java.util.List;



public class euler_09 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #09
	 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
	 * 
	 * a^2 + b^2 = c^2
	 * 	
	 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static void main(String[] args) {
		
		// main loop - check for c^2
		for(int c=1;c<1000;c++)
		{
			// inner loop - check for a^2
			for(int a=1;a<1000;a++)
			{
				for(int b=1;b<1000;b++)
				{
					int tempA = a*a;
					int tempB = b*b;
					int tempC = c*c;
					if(tempA + tempB == tempC)
					{
						int tempSum = a + b + c;

						if(tempSum == 1000)
						{
							System.out.println("Found the magic Pythagorean triplet for a= " + a + ", b= " + b + ", c= " + c);
							
							int tempProd = a*b*c;
							System.out.println("The product of a*b*c is " + tempProd);
							break;
						}
					}
					
					
				} // close inner-b FOR
				
			} // close inner-a FOR
		
			
		} // close main FOR
		
		
		
	} // close MAIN

	
	// helper functions
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
