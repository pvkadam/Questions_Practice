import java.util.ArrayList;


public class firstKOccurence {
	
	public static int firstKOccurence(ArrayList<Integer> a, int k) {

		int leftIndex = 0, rightIndex = a.size() - 1, result = -1;
		
		while (leftIndex <= rightIndex) {
			int mid = leftIndex + (rightIndex - leftIndex)/2;
			
			if (a.get(mid) > k) {
				rightIndex = mid - 1;
			}
			
			else if (a.get(mid) == k) {
				result = mid;
				rightIndex = mid - 1;
			}
			
			else if (a.get(mid) < k) {
				leftIndex = mid + 1;
			}
		}
		
		return result;
	}
}
