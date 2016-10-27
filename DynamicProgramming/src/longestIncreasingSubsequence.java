import java.util.*;


/*
 * Find the longest increasing subsequence of a given sequence / array.

In other words, find a subsequence of array in which the subsequence’s elements are in strictly increasing order, and in which the subsequence is as long as possible. 
This subsequence is not necessarily contiguous, or unique.
In this case, we only care about the length of the longest increasing subsequence.

Example :

Input : [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]
Output : 6
The sequence : [0, 2, 6, 9, 13, 15] or [0, 4, 6, 9, 11, 15] or [0, 4, 6, 9, 13, 15]
 */
public class longestIncreasingSubsequence {
	public int lis(final List<Integer> a) {
		   if(a==null || a.size()==0)
	        return 0;
	 
	    int[] max = new int[a.size()];
	 
	    for(int i=0; i<a.size(); i++){
	        max[i]=1;
	        for(int j=0; j<i;j++){
	            if(a.get(i)>a.get(j)){
	                max[i]=Math.max(max[i], max[j]+1);
	            }
	        }
	    }
	 
	    int result = 0;
	    for(int i=0; i<max.length; i++){
	        if(max[i]>result)
	            result = max[i];
	    }
	    return result;
		}
}
