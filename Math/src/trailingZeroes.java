public class trailingZeroes {
	public int trailingZeroes1(int a) {
	    
		int zeroes = 0;
		
	   /*
	    * logic: 5! has 1 zero (2*5*1)
	    * 10! has 2 zeroes (2*5*2)
	    * 15! has 3 zeroes (2*5*3)
	    * 20! has 4 zeroes (2*5*4)
	    * 
	    */
		
		if (a < 5) {
			System.out.println(0);
			return 0;
		}
		
		else if (a == 5) {
			System.out.println(1);
			return 1;
		}
		
		else {
			for (int i = 5; (a/i) >= 1; i *= 5) {
				zeroes += a/i;
			}
		}
		
		System.out.println(zeroes);
		return zeroes;
	}
	
	public static void main (String[]args) {
		trailingZeroes newClass = new trailingZeroes();
		newClass.trailingZeroes1(9247);
	} 
}
