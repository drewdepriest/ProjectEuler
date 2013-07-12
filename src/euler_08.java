import java.util.ArrayList;
import java.util.List;



public class euler_08 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #08
	 * Find the greatest product of five consecutive digits in the 1000-digit number:
	 * 	
	 * (pasted below into variable)
	 */
	public static void main(String[] args) {
		
		// originally cast as a string
		String puzzleStr = "731671765313306249192251196744265747423553491949349698352031277450632623957831801698480186947885184385861560789112949495459501737958331952853208805511125406987471585238630507156932909632952274430435576689664895044524452316173185640309871112172238311362229893423380308135336276614282806444486645238749303589072962904915604407723907138105158593079608667017242712188399879790879227492190169972088809377665727333001053367881220235421809751254540594752243525849077116705560136048395864467063244157221553975369781797784617406495514929086256932197846862248283972241375657056057490261407972968652414535100474821663704844031998900088952434506585412275886668811642717147992444292823086346567481391912316282458617866458359124566529476545682848912883142607690042242190226710556263211111093705442175069416589604080719840385096245544436298123098787992724428490918884580156166097919133875499200524063689912560717606058861164671094050775410022569831552000559357297257163626956188267042825248360082325753042075296345";
		
		// loop through the string, break into an array of 5-characters each
		// Can't use an array because they are fixed length
		// Need to use a string list in order to build it dynamically
		List<String> numList = new ArrayList<String>();
		
		for(int i=0;i<puzzleStr.length()-4;i++)
		{
			String tempNum = puzzleStr.substring(i,i+5);
			
			// add to the string list
			numList.add(tempNum);
		}
		
		// now that we have the list of 5-char sequences, time to loop through them to find the greatest product
		int greatestProd = 0;
		
		for(int j=0;j<numList.size();j++)
		{
			String tempStr = numList.get(j);
			int tempProd = 1;
			
			// loop through each 5-character sequence to get the product
			for (int k=0;k<tempStr.length();k++)
			{
				int tempInt = Character.getNumericValue((tempStr.charAt(k)));
				tempProd = tempInt*tempProd;
			}
			
			if(tempProd > greatestProd)
			{
				greatestProd = tempProd;
			}
			
		}
		
		System.out.println("The greatest product is: " + greatestProd);
		
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
