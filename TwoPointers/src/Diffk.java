/*
 * Given an array ÔAÕ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

 Example: Input : 
    A : [1 3 5] 
    k : 4
 Output : YES as 5 - 1 = 4 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
import java.util.*;
public class Diffk {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    
	    int i = 0; int j = 1;
	    
	    while (i < a.size() && j < a.size()) {
	        int difference = a.get(j) - a.get(i);
	        if (difference == b & i!=j) {
	            return 1;
	        }
	        else if (difference < b) {
	            j++;
	        }
	        else {
	            i++;
	        }
	    }
	    return 0;
	}
}
