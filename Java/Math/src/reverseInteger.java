/*
 * Reverse digits of an integer.

Example1:

x = 123,

return 321
Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer
 */
public class reverseInteger {
	public int reverse(int a) {
	    boolean isNegative = a < 0;
	    
	    long result = 0;
	    
	    long xRemaining = Math.abs(a);
	    
	    while (xRemaining != 0) {
	        result = result*10 + xRemaining%10;
	        xRemaining /=10;
	        
	    }
	    
	    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
	        return 0;
	    }
	    
	    return isNegative ? ((int) -result) : ((int) result);
    
	}
}
