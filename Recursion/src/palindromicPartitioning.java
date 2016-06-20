import java.util.*;

/*
 * For input 1331 
 * Output is: [1, 3, 3, 1], [1, 33, 1], [1331]
 */

public class palindromicPartitioning {
	public ArrayList<ArrayList<String>> partition(String a) {
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		recursivePartition(a, 0, new ArrayList<String>(), result);
		return result;
	}
	
	//String a --> input
	//int offset --> to be shifted
	//prefix --> substring to be added to partialPartition
	//partialPartition --> temporary partition arraylist including prefixes
	//result --> if partial partition is palindromic, then add result
	public void recursivePartition(String a, int offset, ArrayList<String> partialPartition, ArrayList<ArrayList<String>> result) {
		
		//base case
		if (offset == a.length()) {
			System.out.println(partialPartition);
			result.add(new ArrayList<String>(partialPartition));
		}
		
		for (int i = offset + 1; i <= a.length(); i++) {
			
			String prefix = a.substring(offset, i);
			
			if (isPalindromic(prefix)) {
				partialPartition.add(prefix);
				recursivePartition(a, i, partialPartition, result);
				partialPartition.remove(partialPartition.size() -1);
			}
		}
		
	}
	
	public boolean isPalindromic(String input) {
		
		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(input.length() -1 -i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args) {
		palindromicPartitioning class1 = new palindromicPartitioning();
		class1.partition("1331");
		
	}
}
