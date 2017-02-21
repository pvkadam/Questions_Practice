/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).

You are given a target value to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Input : [4 5 6 7 0 1 2] and target = 4
Output : 0
 */
import java.util.*;
public class rotatedSortedArraySearch {
	public int search(final List<Integer> a, int b) {
	    
        int left = 0;
        int right= a.size()-1;
     
        while(left<=right){
        	
            int mid = left + (right-left)/2;
            
            if(b==a.get(mid))
                return mid;
     
            if(a.get(left) <= a.get(mid)) {
                
            	if(a.get(left) <=b && b < a.get(mid)) {
                    right=mid-1;
                }
                
                else {
                    left=mid+1;
                }
            	
            }
            
            else {
            	
                if(a.get(mid) < b && b <= a.get(right)) {
                    left = mid+1;
                }
                
                else {
                    right = mid-1;
                }
            }    
        }
     
        return -1;
	}
}
