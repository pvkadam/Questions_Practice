/*
 * Given an array with n objects colored red, white or blue, 
sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.

Example :

Input : [0 1 2 0 1 2]
Modify array so that it becomes : [0 0 1 1 2 2]
 */
import java.util.*;
public class sortByColor {
	public void sortColors(ArrayList<Integer> a) {
	    
	    int zero = 0;
	    int one = 0;
	    int two = 0;
	    
	    if (a.size() == 0 || a.size() == 1) {
	        
	    }
	    
	    else {
    	    for (int i = 0; i < a.size(); i++) {
    	        
    	        if (a.get(i) == 0) {
    	            zero++;
    	        }
    	        
    	        else if (a.get(i) == 1) {
    	            one++;
    	        }
    	        
    	        else if (a.get(i) == 2) {
    	            two++;
    	        }
    	       
    	    }
    	    
    	    a.clear();
    	    
    	    for (int i = 0; i < zero; i++) {
    	        a.add(0);
    	    }
    	    
    	    for (int i = zero; i < zero + one; i++) {
    	        a.add(1);
    	    }
    	    
    	    for (int i = zero + one; i < zero + one + two; i++) {
    	        a.add(2);
    	    }	        
	    }

	 
	}
}
