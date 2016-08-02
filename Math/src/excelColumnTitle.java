/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */
public class excelColumnTitle {
	public String convertToTitle(int a) {
		 
	    StringBuilder sb = new StringBuilder();
	    
	    while (a > 0) {
	        a--;
	        char ch = (char) (a%26 + 'A');
	        a = a/26;
	        sb.append(ch);
	    }
	    
	    sb.reverse();
	    return sb.toString();
	    
	}
}
