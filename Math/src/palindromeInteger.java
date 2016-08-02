/*
 * Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False
 */
public class palindromeInteger {
	public boolean isPalindrome(int a) {
	    
	    if (a < 0) {
	        return false;
	    }
	    
	    else {
	        String temp = Integer.toString(a);
	        String result = "";
	        
	        for (int i = temp.length() - 1; i >=0 ; i--) {
	            result = result + temp.charAt(i);
	        }
	        
	        if (temp.equals(result)) {
	            return true;
	        }
	    }
	    
	   
	    
	    return false;
	}
}
