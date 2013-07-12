import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_18 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #18
	 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from 
	 * top to bottom is 23.
	 * 			
	 * 				3
	 * 			   7 4
	 *            2 4 6
	 *           8 5 9 3
	 * 
	 * That is, 3 + 7 + 4 + 9 = 23.
	 * 
	 * Find the maximum total from top to bottom of the triangle below (see code):
	 * 
	 */
	
	public static void main(String[] args) {
	
		// variable used to track the max sum of each path
		int maxCount = 0;
		
		// use to store the initial strings copied from the Project Euler site
		List<String> rowStrings = new ArrayList<String>();
		
		// use to store the list of int lists
    	List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
		
		String row01 = "75";
		String row02 = "95 64";
		String row03 = "17 47 82";
		String row04 = "18 35 87 10";
		String row05 = "20 04 82 47 65";
		String row06 = "19 01 23 75 03 34";
		String row07 = "88 02 77 73 07 63 67";
		String row08 = "99 65 04 28 06 16 70 92";
		String row09 = "41 41 26 56 83 40 80 70 33";
		String row10 = "41 48 72 33 47 32 37 16 94 29";
		String row11 = "53 71 44 65 25 43 91 52 97 51 14";
		String row12 = "70 11 33 28 77 73 17 78 39 68 17 57";
		String row13 = "91 71 52 38 17 14 91 43 58 50 27 29 48";
		String row14 = "63 66 04 68 89 53 67 30 73 16 69 87 40 31";
		String row15 = "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
		
		// remove all white space from the original row strings
		row01 = row01.replaceAll("\\s","");
		row02 = row02.replaceAll("\\s","");
		row03 = row03.replaceAll("\\s","");
		row04 = row04.replaceAll("\\s","");
		row05 = row05.replaceAll("\\s","");
		row06 = row06.replaceAll("\\s","");
		row07 = row07.replaceAll("\\s","");
		row08 = row08.replaceAll("\\s","");
		row09 = row09.replaceAll("\\s","");
		row10 = row10.replaceAll("\\s","");
		row11 = row11.replaceAll("\\s","");
		row12 = row12.replaceAll("\\s","");
		row13 = row13.replaceAll("\\s","");
		row14 = row14.replaceAll("\\s","");
		row15 = row15.replaceAll("\\s","");
		
		// now add each list of strings to the string list
		rowStrings.add(row01);
		rowStrings.add(row02);
		rowStrings.add(row03);
		rowStrings.add(row04);
		rowStrings.add(row05);
		rowStrings.add(row06);
		rowStrings.add(row07);
		rowStrings.add(row08);
		rowStrings.add(row09);
		rowStrings.add(row10);
		rowStrings.add(row11);
		rowStrings.add(row12);
		rowStrings.add(row13);
		rowStrings.add(row14);	
		rowStrings.add(row15);
		
		int numRows = 15;
		
		for(int i=0;i<numRows;i++)
		{
			// use to store the converted ints from strings
			List<Integer> rowInts = new ArrayList<Integer>();
			
			int temp = rowStrings.get(i).length();
			temp = temp/2;
			
			// find each number within each string, add to the row's integer list
			for(int j=0;j<temp;j++)
			{
				String str = rowStrings.get(i).substring(2*j,2*j+2);

				rowInts.add(Integer.parseInt(str));
				//System.out.println("this row int is " + rowInts.get(j));

			}

			// add the new rowInts list to the listOfLists list #lists
			// this is now a multi-dimensional working list of lists of every integer
			listOfLists.add(rowInts);
		}
		
		// time to traverse the list of lists and find the max path sum
		// ** path must traverse from each row to same index or index + 1
		// ** need to be cognizant of row size so as to avoid index out of bounds
		
		maxCount = listOfLists.get(0).get(0);
		
		// listOfLists.size() corresponds to the number of rows
		for(int k=0;k<listOfLists.size()-1;k++)
		{
			for(int l=0;l<listOfLists.get(k).size()-1;l++)
			{
				// check to see which path to follow (either index k or index k+1)
				if(listOfLists.get(k+1).get(l) > listOfLists.get(k+1).get(l+1))
				{
					maxCount = maxCount + listOfLists.get(k+1).get(l);
				}
				else
				{
					maxCount = maxCount + listOfLists.get(k+1).get(l+1);
				}
			}
		}
		
		System.out.println(maxCount);

		
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
