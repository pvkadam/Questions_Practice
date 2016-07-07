/*
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
import java.util.*;
public class sortedInsertPosition {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    
	    int start = 0;
	    int end = a.size() - 1;
	    int mid = 0;
	    
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
	            return mid;
	        }
	        
	        else if (a.get(mid) > b) {
	            end = mid - 1;
	        }
	        
	        else if (a.get(mid) < b) {
	            start = mid + 1;
	        }
	    }
	    
	    if (a.get(mid) > b) {
	        return mid;
	    }
	    
	    else if (a.get(mid) < b) {
	        return mid + 1;
	    }
	    
	    return mid;
	    
	}
}
