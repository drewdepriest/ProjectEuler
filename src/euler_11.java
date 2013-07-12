import java.util.ArrayList;
import java.util.List;


public class euler_11 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #11
	 * In the 20x20 grid below (found at http://projecteuler.net/problem=11), four numbers along a diagonal line have been 
	 * marked in red.
	 * 
	 * The product of these numbers is 26  63  78  14 = 1788696.
	 * 
	 * What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the 2020 grid?
	 */
	public static void main(String[] args) {
		
		List<String> matrixStrings = new ArrayList<String>();
		
		// fat finger in all the rows from the web site (only way to get values here)
		String matrixStr0 = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08";
		String matrixStr1 = "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00";
		String matrixStr2 = "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65";
		String matrixStr3 = "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91";
		String matrixStr4 = "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80";
		String matrixStr5 = "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50";
		String matrixStr6 = "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70";
		String matrixStr7 = "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21";
		String matrixStr8 = "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72";
		String matrixStr9 = "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95";
		String matrixStr10 = "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92";
		String matrixStr11 = "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57";
		String matrixStr12 = "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58";
		String matrixStr13 = "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40";
		String matrixStr14 = "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66";
		String matrixStr15 = "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69";
		String matrixStr16 = "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36";
		String matrixStr17 = "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16";
		String matrixStr18 = "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54";
		String matrixStr19 = "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		
		// remove all white space from the original row strings
		matrixStr0 = matrixStr0.replaceAll("\\s","");
		matrixStr1 = matrixStr1.replaceAll("\\s","");
		matrixStr2 = matrixStr2.replaceAll("\\s","");
		matrixStr3 = matrixStr3.replaceAll("\\s","");
		matrixStr4 = matrixStr4.replaceAll("\\s","");
		matrixStr5 = matrixStr5.replaceAll("\\s","");
		matrixStr6 = matrixStr6.replaceAll("\\s","");
		matrixStr7 = matrixStr7.replaceAll("\\s","");
		matrixStr8 = matrixStr8.replaceAll("\\s","");
		matrixStr9 = matrixStr9.replaceAll("\\s","");
		matrixStr10 = matrixStr10.replaceAll("\\s","");
		matrixStr11 = matrixStr11.replaceAll("\\s","");
		matrixStr12 = matrixStr12.replaceAll("\\s","");
		matrixStr13 = matrixStr13.replaceAll("\\s","");
		matrixStr14 = matrixStr14.replaceAll("\\s","");
		matrixStr15 = matrixStr15.replaceAll("\\s","");
		matrixStr16 = matrixStr16.replaceAll("\\s","");
		matrixStr17 = matrixStr17.replaceAll("\\s","");
		matrixStr18 = matrixStr18.replaceAll("\\s","");
		matrixStr19 = matrixStr19.replaceAll("\\s","");
		
		// add all the strings to a list
		matrixStrings.add(matrixStr0);
		matrixStrings.add(matrixStr1);
		matrixStrings.add(matrixStr2);
		matrixStrings.add(matrixStr3);
		matrixStrings.add(matrixStr4);
		matrixStrings.add(matrixStr5);
		matrixStrings.add(matrixStr6);
		matrixStrings.add(matrixStr7);
		matrixStrings.add(matrixStr8);
		matrixStrings.add(matrixStr9);
		matrixStrings.add(matrixStr10);
		matrixStrings.add(matrixStr11);
		matrixStrings.add(matrixStr12);
		matrixStrings.add(matrixStr13);
		matrixStrings.add(matrixStr14);
		matrixStrings.add(matrixStr15);
		matrixStrings.add(matrixStr16);
		matrixStrings.add(matrixStr17);
		matrixStrings.add(matrixStr18);
		matrixStrings.add(matrixStr19);
		
		Integer[][] matrix = new Integer[20][20];
		
		// dynamically build the matrix
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				// for each cell, find the 2-char substring in each string and cast as an int
				matrix[i][j] = Integer.parseInt(matrixStrings.get(i).substring(2*j,2*j+2));	
			}
		} // close FOR loop from building the matrix
		
		// init the variable to track the largest product
		int maxProduct = 0;
		int tempAcross = 0;
		int tempDown = 0;
		int tempDiagA = 0;
		int tempDiagB = 0;
		int tempDiagC = 0;
		int tempDiagD = 0;
		
		// STEP 1a: Find the products of 4-number sequences ACROSS from left to right (0,0)
		for(int k=0;k<20;k++)
		{
			for(int l=0;l<17;l++)
			{
				//System.out.println(matrix[k][l] + "," + matrix[k][l+1] + "," + matrix[k][l+2] + "," + matrix[k][l+3]);
				tempAcross = matrix[k][l] * matrix[k][l+1] * matrix[k][l+2] * matrix[k][l+3];
				if(tempAcross > maxProduct)
				{
					maxProduct = tempAcross;
				}
			}
		
		} // close FOR loop for STEP 1a
		
		//System.out.println("The maximum product of 1a is " + maxProduct);
		
		// STEP 1b: Find the products of 4-number sequences ACROSS from right to left (0,20)
		for(int k=0;k<20;k++)
		{
			for(int l=19;l>2;l--)
			{
				//System.out.println(matrix[k][l] + "," + matrix[k][l+1] + "," + matrix[k][l+2] + "," + matrix[k][l+3]);
				tempAcross = matrix[k][l] * matrix[k][l-1] * matrix[k][l-2] * matrix[k][l-3];
				if(tempAcross > maxProduct)
				{
					maxProduct = tempAcross;
				}
			}
		
		} // close FOR loop for STEP 1b
		
		//System.out.println("The maximum product of 1b is " + maxProduct);

		// STEP 2a: Find the products of 4-number sequences DOWN
		for(int m=0;m<17;m++)
		{
			for(int n=0;n<20;n++)
			{
				tempDown = matrix[m][n] * matrix[m+1][n] * matrix[m+2][n] * matrix[m+3][n];
				//System.out.println("product is " + tempDown + " for top row " + m);
				
				if(tempDown > maxProduct)
				{
					maxProduct = tempDown;
					//System.out.println(maxProduct);
				}
			}
		
		} // close FOR loop for STEP 2a
		
		//System.out.println("The maximum product of 2a is " + maxProduct);

		// STEP 2b: Find the products of 4-number sequences UP
		for(int m=19;m>2;m--)
		{
			for(int n=0;n<20;n++)
			{
				//System.out.println(matrix[m][n] + "," + matrix[m+1][n] + "," + matrix[m+2][n] + "," + matrix[m+3][n]);
				tempDown = matrix[m][n] * matrix[m-1][n] * matrix[m-2][n] * matrix[m-3][n];
				if(tempDown > maxProduct)
				{
					maxProduct = tempDown;
				}
			}
		
		} // close FOR loop for STEP 2b
		
		//System.out.println("The maximum product of 2b is " + maxProduct);
		
		// STEP 3a: Find the products of 4-number sequences DIAGONALLY (start at 0,0)
		for(int s=0;s<17;s++)
		{
			for(int t=0;t<17;t++)
			{
				//System.out.println(matrix[s][t] + "," + matrix[s+1][t+1] + "," + matrix[s+2][t+2] + "," + matrix[s+3][t+3]);
				tempDiagA = matrix[s][t] * matrix[s+1][t+1] * matrix[s+2][s+2] * matrix[s+3][t+3];
				if(tempDiagA > maxProduct)
				{
					maxProduct = tempDiagA;
				}
			}
		
		} // close FOR loop for STEP 3a
		
		// STEP 3b: Find the products of 4-number sequences DIAGONALLY (start at 0,20)
		for(int s=0;s<17;s++)
		{
			for(int t=19;t>2;t--)
			{
				//System.out.println(matrix[s][t] + "," + matrix[s+1][t+1] + "," + matrix[s+2][t+2] + "," + matrix[s+3][t+3]);
				tempDiagB = matrix[s][t] * matrix[s+1][t-1] * matrix[s+2][t-2] * matrix[s+3][t-3];
				if(tempDiagB > maxProduct)
				{
					maxProduct = tempDiagB;
				}
			}
		
		} // close FOR loop for STEP 3b
		
		// STEP 3c: Find the products of 4-number sequences DIAGONALLY (start at 20,0)
		for(int u=19;u>2;u--)
		{
			for(int v=0;v<17;v++)
			{
				//System.out.println(matrix[u][v] + "," + matrix[u-1][v-1] + "," + matrix[u-2][v-2] + "," + matrix[u-3][v-3]);
				tempDiagC = matrix[u][v] * matrix[u-1][v+1] * matrix[u-2][v+2] * matrix[u-3][v+3];
				if(tempDiagC > maxProduct)
				{
					maxProduct = tempDiagC;
				}
			}
		
		} // close FOR loop for STEP 3c
		
		// STEP 3d: Find the products of 4-number sequences DIAGONALLY (start at 20,20)
		for(int u=19;u>2;u--)
		{
			for(int v=19;v>2;v--)
			{
				//System.out.println(matrix[u][v] + "," + matrix[u-1][v-1] + "," + matrix[u-2][v-2] + "," + matrix[u-3][v-3]);
				tempDiagD = matrix[u][v] * matrix[u-1][v-1] * matrix[u-2][v-2] * matrix[u-3][v-3];
				if(tempDiagD > maxProduct)
				{
					maxProduct = tempDiagD;
				}
			}
		
		} // close FOR loop for STEP 3d
		
		System.out.println("The maximum product of any 4 connected cells is " + maxProduct);
		
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
