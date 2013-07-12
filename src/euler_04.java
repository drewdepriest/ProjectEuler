

public class euler_04 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #04
	 * A palindromic number reads the same both ways. The largest palindrome 
	 * made from the product of two 2-digit numbers is 9009 = 91 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {

		int i;
		int j;
		int product;
		int palindrome = 0;
		
		for(i=100;i<1000;i++)
		{
			for(j=100;j<1000;j++)
			{
				product = i*j;
				
				// recast as a string
				String productStr = new String();
				productStr = String.valueOf(product);
				
				// check for palindromes
				if(productStr.charAt(0) == productStr.charAt(productStr.length()-1) && productStr.charAt(1) == productStr.charAt(productStr.length()-2) && productStr.charAt(2) == productStr.charAt(productStr.length()-3)) 
				{  
				  if(product > palindrome)
				  {
				 	 palindrome = product;
				  }
				  
				}
				
			}
			
		} // close FOR loop
		
	 	 System.out.println("The largest palindrome from the product of two three-digit numbers is "+ palindrome);
				
	} // close MAIN

	
		
} // close CLASS
