import java.util.*;
/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. 
 Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.
 
 If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
 
 Input: [2, 7, 11, 15], target=9
 Output: index1 = 1, index2 = 2
 */

/*
 * if target is 22:
 * key (difference) :20, 15, 11, 
 * val: 			  0,  1,  2,
 */

/*
 * A : [ 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 ]
B : -3

output: 4, 8
 */

public class twoSumHashMap {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
    	
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < a.size(); i++) {
            
            if (map.containsKey(a.get(i))) {
                result.add(1 + map.get(a.get(i)));
                result.add(i + 1);
                return result;
            }
            
            int difference = b - a.get(i);
            // keep the minimum index for index1
            //if map contains the difference, then do nothing! that's how minimum index is kept - smart!
            if (!map.containsKey(difference)) {
                map.put(difference, i);
            }
        }
        return result;
    }
}
