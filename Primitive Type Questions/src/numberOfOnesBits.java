/*
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.


 */
public class numberOfOnesBits {
	public int numSetBits(long a) {
	    int zeroes = 0;
	    
	    while (a!=0) {
	        if ((a & 1) == 1) {
	            zeroes++;
	        }
	        a >>= 1;
	    }
	    
	    return zeroes;
	}
}
