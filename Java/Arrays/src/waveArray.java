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
	public ArrayList<Integer> wave(ArrayList<Integer> A) {
	    
	    Collections.sort(A);
	    int n = A.size();
	    
	    for (int i = 0; i < n - 1; i += 2) {
	        exch(A, i, i + 1);
	    }
	    
	    return A;
	    
	}
	
	private void exch(ArrayList<Integer> A, int i, int j) {
	    int temp = A.get(i);
	    A.set(i, A.get(j));
	    A.set(j, temp);
	}
}
