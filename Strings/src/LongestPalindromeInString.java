import java.util.*;

public class LongestPalindromeInString {
	public static String longestPalindrome(String a) {
		if (a.length() == 0) {
			return null;
		}
		
		else if (a.length() == 1) {
			return a;
		}
		
		String longest = a.substring(0, 1);
		
		for (int i = 0; i < a.length(); i++) {
			String temp = helper(a, i, i);
			System.out.println("temp first " + temp);
			
			if (temp.length() > longest.length()) {
				longest = temp;
			}
			
			
			//for special case of abb (to take care of b)
			temp = helper(a, i, i+1);
			System.out.println("temp second " + temp);
			if (temp.length() > longest.length()) {
				longest = temp;
			}
		}
		
		return longest;
		
	}
	//String s, and will keep decreasing begin and end index if it is a palindrome to check for more palindromes
	// Given a center - s string, either one letter or two letter, 
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() -1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		
		return s.substring(begin + 1, end);	//since begin failed to be palindrome, take the previous one, that is, begin + 1
		
	}	
	
	
	public static void main (String[] args) {
		longestPalindrome("abcdcg");
	}
}
