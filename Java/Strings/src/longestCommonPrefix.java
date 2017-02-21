/*
 * Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]

The answer would be “a”.
 */
import java.util.*;
public class longestCommonPrefix {
	public String longestCommon(ArrayList<String> a) {
	    
	    if (a.size() == 0) {
	        return null;
	        
	    } 
	    
	    for (int prefixLen = 0; prefixLen < a.get(0).length(); prefixLen++) {
	        char c = a.get(0).charAt(prefixLen);
	        
	        for (int i = 1; i < a.size(); i++) {
	            if (prefixLen >= a.get(i).length() || a.get(i).charAt(prefixLen) != c ) {
	                return a.get(i).substring(0,prefixLen);
	            }
	        }
	    }
	    
	    return a.get(0);
	}
}
