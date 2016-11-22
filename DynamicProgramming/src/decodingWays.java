/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

Example :

Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */


public class decodingWays {
	public static int numDecodings(String a) {
		if (a.length() == 0 || a.equals("0")) {
			return 0;
		}
		
		int[] array = new int[a.length() + 1];
		
		array[0] = 1;
		
		//check for the first character
		if (isValid(a.substring(0, 1))) {
			array[1] = 1;
		}
		
		else {
			array[1] = 0;
		}
		
		for (int i = 2; i <= a.length(); i++) {
			if (isValid(a.substring(i-1, i))) {
				array[i] += array[i-1];
			}
			
			if (isValid(a.substring(i-2, i))) {
				array[i] += array[i-2];
			}
		}
		
		System.out.println(array[a.length()]);
		return array[a.length()];
		
	}
	
	public static boolean isValid(String s) {
		if (s.charAt(0) == '0') {
			return false;
		}
		
		int value = Integer.parseInt(s);
		
		if (value >= 1 && value <= 26) {
			return true;
		}
		
		return false;
		
	}
}
