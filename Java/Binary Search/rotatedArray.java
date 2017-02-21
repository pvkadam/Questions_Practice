/*
 * Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.
 */
import java.util.*;

public class rotatedArray {
	public int findMin(final List<Integer> a) {
	  
		int leftIndex = 0;
		int rightIndex = a.size() - 1;
		
		while (leftIndex <= rightIndex) {
			if (a.get(leftIndex) <= a.get(rightIndex)) {
				return a.get(leftIndex);
			}
			
			int mid = leftIndex + (rightIndex - leftIndex)/2;
			
			if (a.get(mid) >= a.get(leftIndex)) {
				leftIndex = mid + 1;
			}
			
			else {
				rightIndex = mid;
			}
			
		}
	      
		return -1;
	}
}
