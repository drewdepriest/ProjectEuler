import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


public class euler_13 {

	@SuppressWarnings("unused")
	private static int m;

	/**
	 * ProjectEuler.net - Problem #13
	 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	 * 
	 * (stored it in main function below)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		List<String> bigNumStrings = new ArrayList<String>();

		String bigNumber01 = "37107287533902102798797998220837590246510135740250";
		String bigNumber02 = "46376937677490009712648124896970078050417018260538";
		String bigNumber03 = "74324986199524741059474233309513058123726617309629";
		String bigNumber04 = "91942213363574161572522430563301811072406154908250";
		String bigNumber05 = "23067588207539346171171980310421047513778063246676";
		String bigNumber06 = "89261670696623633820136378418383684178734361726757";
		String bigNumber07 = "28112879812849979408065481931592621691275889832738";
		String bigNumber08 = "44274228917432520321923589422876796487670272189318";
		String bigNumber09 = "47451445736001306439091167216856844588711603153276";
		String bigNumber10 = "70386486105843025439939619828917593665686757934951";
		String bigNumber11 = "62176457141856560629502157223196586755079324193331";
		String bigNumber12 = "64906352462741904929101432445813822663347944758178";
		String bigNumber13 = "92575867718337217661963751590579239728245598838407";
		String bigNumber14 = "58203565325359399008402633568948830189458628227828";
		String bigNumber15 = "80181199384826282014278194139940567587151170094390";
		String bigNumber16 = "35398664372827112653829987240784473053190104293586";
		String bigNumber17 = "86515506006295864861532075273371959191420517255829";
		String bigNumber18 = "71693888707715466499115593487603532921714970056938";
		String bigNumber19 = "54370070576826684624621495650076471787294438377604";
		String bigNumber20 = "53282654108756828443191190634694037855217779295145";
		String bigNumber21 = "36123272525000296071075082563815656710885258350721";
		String bigNumber22 = "45876576172410976447339110607218265236877223636045";
		String bigNumber23 = "17423706905851860660448207621209813287860733969412";
		String bigNumber24 = "81142660418086830619328460811191061556940512689692";
		String bigNumber25 = "51934325451728388641918047049293215058642563049483";
		String bigNumber26 = "62467221648435076201727918039944693004732956340691";
		String bigNumber27 = "15732444386908125794514089057706229429197107928209";
		String bigNumber28 = "55037687525678773091862540744969844508330393682126";
		String bigNumber29 = "18336384825330154686196124348767681297534375946515";
		String bigNumber30 = "80386287592878490201521685554828717201219257766954";
		String bigNumber31 = "78182833757993103614740356856449095527097864797581";
		String bigNumber32 = "16726320100436897842553539920931837441497806860984";
		String bigNumber33 = "48403098129077791799088218795327364475675590848030";
		String bigNumber34 = "87086987551392711854517078544161852424320693150332";
		String bigNumber35 = "59959406895756536782107074926966537676326235447210";
		String bigNumber36 = "69793950679652694742597709739166693763042633987085";
		String bigNumber37 = "41052684708299085211399427365734116182760315001271";
		String bigNumber38 = "65378607361501080857009149939512557028198746004375";
		String bigNumber39 = "35829035317434717326932123578154982629742552737307";
		String bigNumber40 = "94953759765105305946966067683156574377167401875275";
		String bigNumber41 = "88902802571733229619176668713819931811048770190271";
		String bigNumber42 = "25267680276078003013678680992525463401061632866526";
		String bigNumber43 = "36270218540497705585629946580636237993140746255962";
		String bigNumber44 = "24074486908231174977792365466257246923322810917141";
		String bigNumber45 = "91430288197103288597806669760892938638285025333403";
		String bigNumber46 = "34413065578016127815921815005561868836468420090470";
		String bigNumber47 = "23053081172816430487623791969842487255036638784583";
		String bigNumber48 = "11487696932154902810424020138335124462181441773470";
		String bigNumber49 = "63783299490636259666498587618221225225512486764533";
		String bigNumber50 = "67720186971698544312419572409913959008952310058822";
		String bigNumber51 = "95548255300263520781532296796249481641953868218774";
		String bigNumber52 = "76085327132285723110424803456124867697064507995236";
		String bigNumber53 = "37774242535411291684276865538926205024910326572967";
		String bigNumber54 = "23701913275725675285653248258265463092207058596522";
		String bigNumber55 = "29798860272258331913126375147341994889534765745501";
		String bigNumber56 = "18495701454879288984856827726077713721403798879715";
		String bigNumber57 = "38298203783031473527721580348144513491373226651381";
		String bigNumber58 = "34829543829199918180278916522431027392251122869539";
		String bigNumber59 = "40957953066405232632538044100059654939159879593635";
		String bigNumber60 = "29746152185502371307642255121183693803580388584903";
		String bigNumber61 = "41698116222072977186158236678424689157993532961922";
		String bigNumber62 = "62467957194401269043877107275048102390895523597457";
		String bigNumber63 = "23189706772547915061505504953922979530901129967519";
		String bigNumber64 = "86188088225875314529584099251203829009407770775672";
		String bigNumber65 = "11306739708304724483816533873502340845647058077308";
		String bigNumber66 = "82959174767140363198008187129011875491310547126581";
		String bigNumber67 = "97623331044818386269515456334926366572897563400500";
		String bigNumber68 = "42846280183517070527831839425882145521227251250327";
		String bigNumber69 = "55121603546981200581762165212827652751691296897789";
		String bigNumber70 = "32238195734329339946437501907836945765883352399886";
		String bigNumber71 = "75506164965184775180738168837861091527357929701337";
		String bigNumber72 = "62177842752192623401942399639168044983993173312731";
		String bigNumber73 = "32924185707147349566916674687634660915035914677504";
		String bigNumber74 = "99518671430235219628894890102423325116913619626622";
		String bigNumber75 = "73267460800591547471830798392868535206946944540724";
		String bigNumber76 = "76841822524674417161514036427982273348055556214818";
		String bigNumber77 = "97142617910342598647204516893989422179826088076852";
		String bigNumber78 = "87783646182799346313767754307809363333018982642090";
		String bigNumber79 = "10848802521674670883215120185883543223812876952786";
		String bigNumber80 = "71329612474782464538636993009049310363619763878039";
		String bigNumber81 = "62184073572399794223406235393808339651327408011116";
		String bigNumber82 = "66627891981488087797941876876144230030984490851411";
		String bigNumber83 = "60661826293682836764744779239180335110989069790714";
		String bigNumber84 = "85786944089552990653640447425576083659976645795096";
		String bigNumber85 = "66024396409905389607120198219976047599490197230297";
		String bigNumber86 = "64913982680032973156037120041377903785566085089252";
		String bigNumber87 = "16730939319872750275468906903707539413042652315011";
		String bigNumber88 = "94809377245048795150954100921645863754710598436791";
		String bigNumber89 = "78639167021187492431995700641917969777599028300699";
		String bigNumber90 = "15368713711936614952811305876380278410754449733078";
		String bigNumber91 = "40789923115535562561142322423255033685442488917353";
		String bigNumber92 = "44889911501440648020369068063960672322193204149535";
		String bigNumber93 = "41503128880339536053299340368006977710650566631954";
		String bigNumber94 = "81234880673210146739058568557934581403627822703280";
		String bigNumber95 = "82616570773948327592232845941706525094512325230608";
		String bigNumber96 = "22918802058777319719839450180888072429661980811197";
		String bigNumber97 = "77158542502016545090413245809786882778948721859617";
		String bigNumber98 = "72107838435069186155435662884062257473692284509516";
		String bigNumber99 = "20849603980134001723930671666823555245252804609722";
		String bigNumber100 = "53503534226472524250874054075591789781264330331690";
		
		bigNumStrings.add(bigNumber01);
		bigNumStrings.add(bigNumber02);
		bigNumStrings.add(bigNumber03);
		bigNumStrings.add(bigNumber04);
		bigNumStrings.add(bigNumber05);
		bigNumStrings.add(bigNumber06);
		bigNumStrings.add(bigNumber07);
		bigNumStrings.add(bigNumber08);
		bigNumStrings.add(bigNumber09);
		bigNumStrings.add(bigNumber10);
		bigNumStrings.add(bigNumber11);
		bigNumStrings.add(bigNumber12);
		bigNumStrings.add(bigNumber13);
		bigNumStrings.add(bigNumber14);
		bigNumStrings.add(bigNumber15);
		bigNumStrings.add(bigNumber16);
		bigNumStrings.add(bigNumber17);
		bigNumStrings.add(bigNumber18);
		bigNumStrings.add(bigNumber19);
		bigNumStrings.add(bigNumber20);
		bigNumStrings.add(bigNumber21);
		bigNumStrings.add(bigNumber22);
		bigNumStrings.add(bigNumber23);
		bigNumStrings.add(bigNumber24);
		bigNumStrings.add(bigNumber25);
		bigNumStrings.add(bigNumber26);
		bigNumStrings.add(bigNumber27);
		bigNumStrings.add(bigNumber28);
		bigNumStrings.add(bigNumber29);
		bigNumStrings.add(bigNumber30);
		bigNumStrings.add(bigNumber31);
		bigNumStrings.add(bigNumber32);
		bigNumStrings.add(bigNumber33);
		bigNumStrings.add(bigNumber34);
		bigNumStrings.add(bigNumber35);
		bigNumStrings.add(bigNumber36);
		bigNumStrings.add(bigNumber37);
		bigNumStrings.add(bigNumber38);
		bigNumStrings.add(bigNumber39);
		bigNumStrings.add(bigNumber40);
		bigNumStrings.add(bigNumber41);
		bigNumStrings.add(bigNumber42);
		bigNumStrings.add(bigNumber43);
		bigNumStrings.add(bigNumber44);
		bigNumStrings.add(bigNumber45);
		bigNumStrings.add(bigNumber46);
		bigNumStrings.add(bigNumber47);
		bigNumStrings.add(bigNumber48);
		bigNumStrings.add(bigNumber49);
		bigNumStrings.add(bigNumber50);
		bigNumStrings.add(bigNumber51);
		bigNumStrings.add(bigNumber52);
		bigNumStrings.add(bigNumber53);
		bigNumStrings.add(bigNumber54);
		bigNumStrings.add(bigNumber55);
		bigNumStrings.add(bigNumber56);
		bigNumStrings.add(bigNumber57);
		bigNumStrings.add(bigNumber58);
		bigNumStrings.add(bigNumber59);
		bigNumStrings.add(bigNumber60);
		bigNumStrings.add(bigNumber61);
		bigNumStrings.add(bigNumber62);
		bigNumStrings.add(bigNumber63);
		bigNumStrings.add(bigNumber64);
		bigNumStrings.add(bigNumber65);
		bigNumStrings.add(bigNumber66);
		bigNumStrings.add(bigNumber67);
		bigNumStrings.add(bigNumber68);
		bigNumStrings.add(bigNumber69);
		bigNumStrings.add(bigNumber70);
		bigNumStrings.add(bigNumber71);
		bigNumStrings.add(bigNumber72);
		bigNumStrings.add(bigNumber73);
		bigNumStrings.add(bigNumber74);
		bigNumStrings.add(bigNumber75);
		bigNumStrings.add(bigNumber76);
		bigNumStrings.add(bigNumber77);
		bigNumStrings.add(bigNumber78);
		bigNumStrings.add(bigNumber79);
		bigNumStrings.add(bigNumber80);
		bigNumStrings.add(bigNumber81);
		bigNumStrings.add(bigNumber82);
		bigNumStrings.add(bigNumber83);
		bigNumStrings.add(bigNumber84);
		bigNumStrings.add(bigNumber85);
		bigNumStrings.add(bigNumber86);
		bigNumStrings.add(bigNumber87);
		bigNumStrings.add(bigNumber88);
		bigNumStrings.add(bigNumber89);
		bigNumStrings.add(bigNumber90);
		bigNumStrings.add(bigNumber91);
		bigNumStrings.add(bigNumber92);
		bigNumStrings.add(bigNumber93);
		bigNumStrings.add(bigNumber94);
		bigNumStrings.add(bigNumber95);
		bigNumStrings.add(bigNumber96);
		bigNumStrings.add(bigNumber97);
		bigNumStrings.add(bigNumber98);
		bigNumStrings.add(bigNumber99);
		bigNumStrings.add(bigNumber100);
		
		BigInteger runningSum = BigInteger.ZERO;
		
		for(int i=0;i<bigNumStrings.size();i++)
		{
			BigInteger tempBig = new BigInteger(bigNumStrings.get(i));
			//System.out.println(tempBig);
			runningSum = runningSum.add(tempBig);
		}
		
		String result = new String();
		result = String.valueOf(runningSum);
		result = result.substring(0,10);
		
		System.out.println("The first ten digits of the resulting sum are " + result);
		
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
		
} // close CLASS
