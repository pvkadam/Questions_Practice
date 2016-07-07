/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example :

Input : [1 2 2 3 1]
Output : 3
 */
import java.util.*;
public class singleNumber {
	public int singleNumberMethod(final List<Integer> a) {
	    
	    int xor = 0;
	    
	    for (int i = 0; i < a.size(); i++) {
	        
	        xor = xor^a.get(i);
	        
	    }
	    
	    return xor;
	}
}
