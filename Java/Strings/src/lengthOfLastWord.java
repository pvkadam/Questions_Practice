/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.
 */
public class lengthOfLastWord {
	public int lengthOfLastWordMethod(final String a) {
	    int result = 0;
	    
	    if (a.length() == 0) {
	        return 0;
	    }
	    
	    boolean flag = false;
	    for (int i = a.length() -1; i >= 0; i--) {
	        if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
	            flag = true;
	            result++;
	        }
	        
	        else {
    	        if (flag) {
    	            return result;
    	        }	            
	        }
	        
	    }
	    
	    return result;
	}
}
