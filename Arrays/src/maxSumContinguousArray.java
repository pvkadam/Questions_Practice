/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
 */

import java.util.*;
public class maxSumContinguousArray {
	public int maxSubArray(final List<Integer> a) {
	    
        int sum = a.get(0);     //-2
        int maxSum = a.get(0); 
        
        if (a.size() == 0) {
            return 0;
        }
        
        else if (a.size() == 1) {
            return a.get(0);
        }
        
        for (int i = 1; i < a.size(); i++) {
            
            sum = sum + a.get(i);       //-1    //-2    //2     //3     //5
                
            if (a.get(i) > sum) {
                sum = a.get(i);         //1
                
                if (sum >= maxSum) {
                    maxSum = sum;       //1     //4
                }
            }
            
            else  {
                if (sum >= maxSum) {
                    maxSum = sum;       //5
                }
            }
        }
        
        return maxSum;
	    
	    
	}
}
