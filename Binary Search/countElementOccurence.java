import java.util.ArrayList;
import java.util.*;

public class countElementOccurence {
	public static int findCount(final List<Integer> a, int b) {
	    
		if (firstKOccurence(a, b, false) == -1 && firstKOccurence(a, b, true) == -1) {
			return 0;
		}
		return firstKOccurence(a, b, false) - firstKOccurence(a, b, true) + 1;	//last - first + 1
	   
	}
	
	public static int firstKOccurence(List<Integer> a, int k, boolean flag) {

		int leftIndex = 0, rightIndex = a.size() - 1, result = -1;
		
		while (leftIndex <= rightIndex) {
			int mid = leftIndex + (rightIndex - leftIndex)/2;
			
			if (a.get(mid) > k) {
				rightIndex = mid - 1;
			}
			
			else if (a.get(mid) == k && flag) {	//for first occurrence
				result = mid;
				rightIndex = mid - 1;
			}
			
			else if (a.get(mid) == k && !flag) { //for last occurrence
				result = mid;
				leftIndex = mid + 1;
			}
			
			else if (a.get(mid) < k) {
				leftIndex = mid + 1;
			}
		}
		
		return result;
	}
	
	
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(10);
		
		System.out.println(findCount(list, 9));
		
	}
}
