package primitiveTypes;

/*
 * Parity of word is the count of number of ones in an integer. 
 * If number of ones is odd, then parity is 1. Else it is 0. 
 * Used to detect single bit errors in data storage and communication. 
 */

public class parityOfWord  {
	
	//time complexity --> O(n)
	public static short computeParity (long x) {
		short parity = 0;
		
		while (x != 0) {
			parity ^= (x & 1);
			System.out.println("parity is " + parity);
			x >>>=1;
			System.out.println("value of x is " + x);
		}
		
		System.out.println("final value of parity is " + parity);
		return parity;
	}
	
	//time complexity --> O(s) where s is the number of ones
	public static short computeFasterParity (long x) {
		short parity = 0;
		
		while (x != 0) {
			parity ^= 1;
			x &= (x-1);
		}
		
		System.out.println(parity);
		return parity;
	}
	
	
	public static void main (String[] args) {
		computeParity(2);
		computeFasterParity(7);
	}
	
}


