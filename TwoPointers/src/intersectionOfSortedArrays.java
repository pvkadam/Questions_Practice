/*
 * Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]
 */
import java.util.*;
public class intersectionOfSortedArrays {
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	    
	    int lengthA = a.size();
	    int lengthB = b.size();
	    
	    ArrayList<Integer> newList = new ArrayList<Integer>();
	    
	    int i = 0, j = 0;
	    
	    while (i < lengthA && j < lengthB) {
	        if (a.get(i) > b.get(j)) {
	            j++;
	        }
	        
	        else if (a.get(i) < b.get(j)) {
	            i++;
	        }
	        
	        else {
	            newList.add(a.get(i));
	            i++;
	            j++;
	        }
	    }
	    
	    return newList;
	}
}
