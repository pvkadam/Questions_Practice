/*
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
 */
import java.util.*;
public class primeSum {
	   public ArrayList<Integer> primesum(int a) {
	        
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        
	        if (a == 4) {
	            result.add(2);
	            result.add(2);
	        }
	        
	        if (a%2 == 0) {
	            if (a > 2 ) {
	                for (int i = 3; i < a/2; i++) {
	                    if (isPrime(i) && isPrime(a-i)) {
	                        result.add(i);
	                        result.add(a-i);
	                        break;
	                    }
	                }
	            }
	        }
	        
	        return result;
	    }
	    
	    
	    public boolean isPrime(int x) {
	        
	        if (x < 2){
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(x); i++) {
	            if ((x%i) == 0) {
	                return false; 
	            }
	        }
	        
	        return true;
	    }
}
