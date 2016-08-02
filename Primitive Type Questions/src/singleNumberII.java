import java.util.*;
/*
 * Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

Note: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?

Example :
Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
Output : 4

 */
public class singleNumberII {
	public int singleNumber(final List<Integer> a) {
	 
     int ones = 0, twos = 0, threes = 0;
	 
     for (int i = 0; i < a.size(); i++) {
	     twos |= ones & a.get(i);
	     ones ^= a.get(i);
	     threes = ones & twos;
	     ones &= ~threes;
	     twos &= ~threes;
	 }
	 
	 return ones;
	 
	}
	
	public static long reverse(long a) {
        long result = 0;
        int i = 3;
        while(a > 0){
        	
            result += (a % 2) * Math.pow(2, i);
            System.out.println(result);
            i--;                        
            a = a/2;
        }
        System.out.println("final result is " + result);
        return result;
    }
	
	public static void main (String[] args) {
		reverse(12);
	}
}
