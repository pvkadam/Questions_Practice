import java.util.*;

/*
 * Given an array A of integers and another non negative integer k, 
 * find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
 */

public class diffKII {
	public int diffPossible(final List<Integer> a, int b) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < a.size(); i++) {
	    	if (map.containsKey(a.get(i) - b) || map.containsKey(a.get(i) + b)) {
	    		return 1;
	    	}
	    	
	    	map.put(a.get(i), i);
	    	
	    }
	    
	    return 0;
	}
}
