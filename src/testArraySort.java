import java.util.Arrays;


public class testArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] intArr = new Integer[5];
		intArr[0] = 102;
		intArr[1] = 100;
		intArr[2] = 26;
		intArr[3] = 31;
		intArr[4] = 500;
				
		Arrays.sort(intArr);
		
		System.out.println(findIndex(intArr, 26));
		
	}
	
	public static int findIndex(Integer[] intArr, int a)
	{
		for(int i=0;i<intArr.length;i++){
			if(intArr[i] == a){
				return i;
			}
		}
		return -1;
	}


}
