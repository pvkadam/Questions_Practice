/*
 * Given a number N, find all prime numbers upto N ( N included ).

Example:

if N = 7,

all primes till 7 = {2, 3, 5, 7}

Make sure the returned array is sorted.
 */

import java.util.*;

public class allPrimeNumbers {
	public ArrayList<Integer> sieve(int a) {
	    
	    
        int[] array = new int[a+1];
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    if (a == 0 || a == 1) {
	        return null;
	    }
	    
	    for (int i = 0; i <=a; i++) {
	        array[i] = 1;
	    }
	    
	    array[0] = 0;
	    array[1] = 0;
	    
	    for (int i = 2; i <= a; i++) {
	        if (array[i] == 1) {
	            for (int j = 2; i*j <=a; j++) {
	                array[i*j] = 0;
	            }
	        }
	    }

	    for (int i = 2; i < array.length; i++) {
	        if (array[i] == 1){
	            result.add(i);
	        }
	    }
	    
        return result;
	}
}
