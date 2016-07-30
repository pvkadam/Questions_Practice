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
    public static long reverse(long A) {
	    long rev = 0;
	    
	    for (int i = 0; i < 32; i++) {
	        rev <<= 1;
	        if ((A & (1 << i)) != 0) {
	        	rev |= 1;
	        }     
	    }
	    System.out.println(rev);
	    return rev;
	    
	}
	
	public static void main(String[] args) {
		reverse(6);
	}
	
}
