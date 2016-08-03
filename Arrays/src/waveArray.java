/*
 * Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
 */
import java.util.*;
public class waveArray {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    Collections.sort(a);
	    
	    if (a.size() == 0) {
	        return result;
	    }
	    
	    else if (a.size()%2 == 0) {
    	    for (int i = 0; i < a.size(); i+=2) {
    	        result.add(a.get(i+1));
    	        result.add(a.get(i));
    	    }	        
	    }
	    
	    else {
	        for (int i = 0; i < a.size() -1; i +=2) {
	            result.add(a.get(i+1));
    	        result.add(a.get(i));
	        }
	        result.add(a.get(a.size() - 1));
	    }

        return result;
	}
}