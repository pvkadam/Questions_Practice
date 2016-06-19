package primitiveTypes;

public class SwapBits {
	
	/*
	 * x & (x-1) clears the lowest set bit in x. If x is 11, then result is 10 
	 * x & ~(x-1) extracts the lowest set bit in x. If x is 11, then result is 1
	 */
	
	
	/*
	 * Swap the indices i and j in a bit array 
	 * Instead of storing values, implement a much more logical approach
	 * If bits at i and j are the same, then don't do anything
	 * If bits at i and j are different, then flip their individual values
	 */
	

	//time complexity is O(1)
	public static long swapBits(long x, int i, int j) {
		
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {	//shift x by i and j and AND with 1 to see if they are equal
			//flip bits using XOR and bitmask
			//XOR with 1 
			long bitMask = (1 << i) | (1 << j);	
			//System.out.println(bitMask);
			x ^= bitMask;	// 110 with bitmask of 1 at (0, 1)  -> 101
			//1010 with bitmask of 1 at (2,3) -->   0110
			//1010 with bitmask of 1 at (1,2) -->   1100 
		}
		System.out.println(x);
		return x; 
	}
	
	public static void main (String[] args) {
		swapBits(10, 1, 2);
		
	}
}
