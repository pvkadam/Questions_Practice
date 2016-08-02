/*
 * Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 
 */
public class excelColumnNumber {
	public int titleToNumber(String a) {
	    
	    int result = 0;
	    int toThePower = 0;
	    
	    for (int i = a.length() - 1; i >= 0; i--) {
	        result = result + (int)(Math.pow(26, toThePower)) * ((int)(a.charAt(i)) - 64);
	        toThePower++;
	        
	    }
	    
	    return result;
	}
}
