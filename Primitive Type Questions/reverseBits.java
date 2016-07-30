package primitiveTypes;

/*
 * reverse 100011 to 110001
 */

public class reverseBits {
	
	public static void reverseBitsMethod (long x) {
		int b = 0;
		while (x != 0) {
			b <<= 1;
			System.out.println("value of b <<=1 is " + b);
			b |= (x&1);
			System.out.println("value of b  |= (x&1) is " + b);
			x >>= 1;
			System.out.println("value of x >>=1 is " + x);
			System.out.println("-------------------");
			
		}
		System.out.println(b);
	}
	

	//another method
	   public static long reverse(long a) {
	        long result = 0;
	        int i = 31;
	        while(a > 0){
	            result += (a % 2) * Math.pow(2, i);
	            i--;                        
	            a = a/2;
	        }
	        return result;
	    }
    
    //swap method
	public static long swapBits(long x, int i, int j) {
		
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {	//shift x by i and j and AND with 1 to see if they are equal
			//flip bits using XOR and bitmask
			//XOR with 1 
			long bitMask = (1L << i) | (1L << j);	
			//System.out.println(bitMask);
			x ^= bitMask;	// 110 with bitmask of 1 at (0, 1)  -> 101
			//1010 with bitmask of 1 at (2,3) -->   0110
			//1010 with bitmask of 1 at (1,2) -->   1100 
		}
		//System.out.println(x);
		return x; 
	}
	
	public long reverse (long a) {
		long result = a;
		
		for (int i = 0; i <= 31; i++) {
			result = swapBits(result, i, 31 - i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		reverse(6);
	}
	
}
