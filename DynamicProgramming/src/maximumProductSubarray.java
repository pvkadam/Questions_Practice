import java.util.*;

/*
 * When iterating the array, each element has two possibilities: positive number or negative number.
 *  We need to track a minimum value, so that when a negative number is given, 
 *  it can also find the maximum value. 
 * We define two local variables, one tracks the maximum and the other tracks the minimum.
 */
public class maximumProductSubarray {
	public static int maxProduct(final List<Integer> a) {
		int[] max = new int[a.size()];
		int[] min = new int[a.size()];
		
		max[0] = min[0] = a.get(0);
		
		int result = a.get(0);
		
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) > 0) {
				max[i] = Math.max(a.get(i), a.get(i)*max[i -1]);
				min[i] = Math.min(a.get(i), a.get(i)*min[i -1]);
			}
			
			else {
				max[i] = Math.max(a.get(i), a.get(i)*min[i -1]);
				min[i] = Math.min(a.get(i), a.get(i)*max[i -1]);
			}
			
			result = Math.max(result, max[i]);
		}
		
		for (int i = 0; i < max.length; i++) {
			System.out.print(max[i] + " ");
		}
		System.out.println( "---------- ");
		for (int i = 0; i < min.length; i++) {
			System.out.print(min[i] + " ");
		}
		
		
		System.out.println( "---------- ");
		System.out.println(result);
		return result;
	}
	
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(-2);
		list.add(4);
		
		maxProduct(list);
		
	}
}
