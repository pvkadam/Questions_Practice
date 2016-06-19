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
	
	public static void main (String[] args) {
		reverseBitsMethod(6); 
	}
	
}
