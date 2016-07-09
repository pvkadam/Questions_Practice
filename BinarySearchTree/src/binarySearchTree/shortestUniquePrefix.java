package binarySearchTree;
import java.util.*;

/*
 * Find shortest unique prefix to represent each word in the list.

Example:

Input: [zebra, dog, duck, dove]
Output: {z, dog, du, dov}
where we can see that
zebra = z
dog = dog
duck = du
dove = dov
 */

public class shortestUniquePrefix {
	public ArrayList<String> prefix(List<String> a) {
   		TrieNode root = new TrieNode();
   		for(String s : a) {
   			root.insert(s, 0);
   		}
   		ArrayList<String> prefixes = new ArrayList<String>();
   		for(String s : a) {
   			String shortestUniquePrefix = root.search(s, 0);
   			prefixes.add(shortestUniquePrefix);
   		}
   		return prefixes;
	}
	
	private static final class TrieNode {
		private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		private int count = 0;
		
		public void insert(String s, int i) {
			count++;
			if(i < s.length()) {
				Character current = s.charAt(i);
				if(!children.containsKey(current)) {
					children.put(current, new TrieNode());
				}
				TrieNode child = children.get(current);
				child.insert(s, i + 1);
			}
		}
		
		public String search(String s, int i) {
			String prefix = null;
			if(i > 0 && count == 1) {
				prefix = s.substring(0, i);
			} else {
				Character ch = s.charAt(i);
				TrieNode child = children.get(ch);
				prefix = child.search(s, i + 1);
			}
			return prefix;
		}
	}
}
