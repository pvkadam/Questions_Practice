package binarySearchTree;
import java.util.*;

public class kLargestElements {
	
	/*
	 * need to do a reverse inorder traversal
	 * Start from the extreme right and add it (while check if result is less than k values)
	 * Then add left of that extreme right (simultaneously check if result is less than k values)
	 */
	public ArrayList<Integer> findkLargestElements (TreeNode tree, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		return helperMethod(tree, k, result);
	}
	
	public ArrayList<Integer> helperMethod(TreeNode tree, int k, ArrayList<Integer> result) {
		
		if (tree != null && result.size() < k) {
			helperMethod(tree.right, k, result);
			
			if (result.size() < k) {
				result.add(tree.val);
				helperMethod(tree.left, k, result);	
			}
			
		}
		
		return result;		
	}
}
