import java.math.BigInteger;

//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_17 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #17
	 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters 
	 * used in total.
	 * 
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
	 * 
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred 
	 * and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
	 */
	
	public static void main(String[] args) {
	
		// number of numbers to count up to
		int n = 1000;
		
		// count of the letters used in the sequence
		BigInteger letters = BigInteger.ZERO;
		
		// the current number
		int thisNum = 1;
		int hundreds = 1;
		int tens = 1;
		int ones = 1;
		
		while(thisNum < n+1)
		{
			// find the individual places of the given number
			ones = thisNum%10;
			tens = thisNum%100/10;
			hundreds = thisNum/100;
						
			// if less than 20, do not format value
			// just send off to calculate letters
			if(tens == 0 || tens == 1)
			{
				// treat the "teens" digits as a special case
				int teen = ones + (tens*10);
				
				// send off the values to a separate function
				// track the running total here
				letters = letters.add(BigInteger.valueOf(letterCount(teen)));

			} 
			// if greater than or equal to 21, break up into ones, tens & hundreds places
			// then calculate each place individually.
			else
			{
				//letters = letterCount(ones);
				if(tens == 4 || tens == 5 || tens == 6)
				{
					// add 5
					letters = letters.add(BigInteger.valueOf(letterCount(ones)+5));
				}
				
				if(tens == 2 || tens == 3 || tens == 8 || tens == 9)
				{
					// add 6
					letters = letters.add(BigInteger.valueOf(letterCount(ones)+6));
				}
				
				if(tens == 7)
				{
					// add 7
					letters = letters.add(BigInteger.valueOf(letterCount(ones)+7));
				}
			
			}
			
			// next, add letters for the hundreds place
			// note that we must include the "and" as in "one hundred and" which would yield 13 letters
			// ** this first case assumes the number is not a multiple of 100
			if(hundreds > 0 && thisNum%100 != 0 && thisNum != 1000)
			{
				// just add 10 letters ("hundred and") to the count of each hundreds place digit
				letters = letters.add(BigInteger.valueOf(letterCount(hundreds)+10));

			}
			// ** this case assumes the number is a multiple of 100 (don't include the "and")
			else if(hundreds > 0 && thisNum%100 == 0 && thisNum != 1000)
			{
				letters = letters.add(BigInteger.valueOf(letterCount(hundreds)+7));
			}
			
			// finally, include the single case for n equals 1,000
			if(thisNum == 1000)
			{
				// there are 11 letters in "one thousand"
				letters = letters.add(BigInteger.valueOf(11));
			}
			
			thisNum++;			
		}
		
		System.out.println("There are a total of " + letters + " from 1 to " + n + ".");
		
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
	
	static int letterCount(int thisNum)
	{
		int numLetters = 0;
		// values with 3 letters
		
		if(thisNum==1 || thisNum==2 || thisNum==6 || thisNum==10)
		{
			numLetters = numLetters + 3;
		}
		
		// values with 4 letters
		if(thisNum==4 || thisNum==5 || thisNum==9)
		{
			numLetters = numLetters + 4;
		}
		
		// values with 5 letters
		if(thisNum==3 || thisNum==7 || thisNum==8 || thisNum==40 || thisNum==50 || thisNum==60)
		{
			numLetters = numLetters + 5;
		}
		
		// values with 6 letters
		if(thisNum==11 || thisNum==12 || thisNum==20 || thisNum==30 || thisNum==80 || thisNum==90)
		{
			numLetters = numLetters + 6;
		}
		
		// values with 7 letters
		if(thisNum==15 || thisNum==16 || thisNum==70)
		{
			numLetters = numLetters + 7;
		}
		
		// values with 8 letters
		if(thisNum==13 || thisNum==14 || thisNum==18 || thisNum==19)
		{
			numLetters = numLetters + 8;
		}
		
		// values with 9 letters
		if(thisNum==17)
		{
			numLetters = numLetters + 9;
		}
		
		return numLetters;
	}

		
} // close CLASS
