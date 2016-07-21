import java.util.*;
/*
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

Example,
Given:

s1 = "aabcc",
s2 = "dbbca",
When s3 = "aadbbcbcac", return true.
When s3 = "aadbbbaccc", return false.
 */

/*
 * The private method isInterleave is the recursive method. it takes additional 
 * i1, i2, i3 as the start indexes of s1, s2, s3, so it solves the substring of s1, s2, s3 
 * with those start indexes.

The recursion starting condition is i1, i2, i3 are set to 0, means it solves the whole string.

in each recursion, it will just check the first character in s3 with s2 and s1, 
if it equals s1, it will increase i3 and i1 to solve remain, if remain return true, 
this recursion will also return true. Same logic for s2.

The end condition is when remain of either s1 or s2 is empty, then just compare remain of 
s3 with remain of s1 or s2, if they are equal, it will return true.

A pure recursive solution will cause time limit exceed. We can optimize it by caching the 
false visited solutions in the visited set. That will short circuit many repeated search path.
 */
public class interleavingStrings {
  	private static Set<Integer> visited; // The combination of i1, i2 has been visited and return false
	public static boolean isInterleave(String s1, String s2, String s3) {
		if(s3.length() != s1.length() + s2.length())
			return false;
		visited = new HashSet<Integer>();
		return isInterleave(s1, 0, s2, 0, s3, 0);
	}
	
	private static boolean isInterleave(String s1, int i1, String s2, int i2, String s3, int i3)
	{	
		int hash = i1 * s3.length() + i2;
		if(visited.contains(hash))
			return false;
		
		if(i1 == s1.length())
			return s2.substring(i2).equals(s3.substring(i3));
		if(i2 == s2.length())
			return s1.substring(i1).equals(s3.substring(i3));
		
		if(s3.charAt(i3) == s1.charAt(i1) && isInterleave(s1, i1+1, s2, i2, s3, i3+1) ||
		   s3.charAt(i3) == s2.charAt(i2) && isInterleave(s1, i1, s2, i2+1, s3, i3+1))
			return true;
		
		visited.add(hash);
		return false;
	}
}
