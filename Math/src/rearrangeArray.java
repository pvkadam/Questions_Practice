/*
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Example:

Input : [1, 0]
Return : [0, 1]
 Lets say N = size of the array. Then, following holds true :
* All elements in the array are in the range [0, N-1]
* N * N does not overflow for a signed integer 
 */
import java.util.*;
public class rearrangeArray {
	public void arrange(ArrayList<Integer> a) {
	    
	    int temp = 0;
	    int n = a.size();
	       
	    for (int i = 0; i < n; i++) {
	       int num = a.get(i);
	       int B = num;
	       int C = a.get(num);
	       if (C>= n) {
	           
	            C = a.get(num)%n;
	               
	       }
	           
	       int encode = B + C*n;
	       a.set(i, encode);
	        
	    }
	    
	    for (int i = 0; i < a.size(); i ++) {
	        a.set(i, a.get(i)/n);
	    }
	    
	    
	    
	}
}
