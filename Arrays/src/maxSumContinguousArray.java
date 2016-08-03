/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
 */

import java.util.*;
public class maxSumContinguousArray {
	public static int maxSubArray(final ArrayList<Integer> a) {
	    
       int sumEndingHere = a.get(0);
       int maxSumSoFar = a.get(0);
       
       for (int i = 1; i < a.size(); i++) {
    	   sumEndingHere = Math.max(sumEndingHere + a.get(i), a.get(i));
    	   maxSumSoFar = Math.max(sumEndingHere, maxSumSoFar);

    	   
       }

	   return maxSumSoFar;
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-2);
		list.add(1);
		list.add(-3);
		list.add(4);
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(-5);
		list.add(4);
		maxSubArray(list);
	}
}
