/*
 * Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 */
import java.util.*;
public class largestNumber {
	public String largestNumberMethod(final List<Integer> a) {
	    
	    String[] strings = new String[a.size()];	
	    
	    for (int i = 0; i < a.size(); i++) {
	        strings[i] = Integer.toString(a.get(i));
	    }
	    
	    Arrays.sort(strings, new Comparator<String>() {
	        public int compare(String s1, String s2) {
	            String leftRight = s1 + s2;
	            String rightLeft = s2 + s1;
	            return -leftRight.compareTo(rightLeft);
	        }
	    });
	    
	    StringBuilder sb = new StringBuilder();
	    for (String s: strings) {
	        sb.append(s);
	    }
	    
	    while (sb.charAt(0) == '0' && sb.length() > 1) {
	        sb.deleteCharAt(0);
	    }
	    
	    return sb.toString();
	}
}
