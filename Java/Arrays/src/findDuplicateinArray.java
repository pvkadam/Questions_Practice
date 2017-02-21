/*
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.
 */

import java.util.*;
public class findDuplicateinArray {
	public int repeatedNumber(final List<Integer> a) {
		   
		  HashSet<Integer> array = new HashSet<Integer>();
		  
		  for (Integer numbers: a) {
		      if (array.add(numbers) == false) {
		          return numbers;
		      }
		  }
		
		  
		  return 0;

		}
}
