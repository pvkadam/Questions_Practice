package binarySearchTree;
import java.util.*;
public class rangeLookupProblem {
	
	public ArrayList<Integer> rangeLookUp(TreeNode tree, Interval interval) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		return helperMethod(tree, interval, result);	
	}
	
	public ArrayList<Integer> helperMethod(TreeNode tree, Interval interval, ArrayList<Integer> result) {
		if (tree == null) {
			return result;
		}
		
		if (tree.val >= interval.left && tree.val <= interval.right) {
			//inorder type 
			helperMethod(tree.left, interval, result);
			result.add(tree.val);
			helperMethod(tree.right, interval, result);
		}
		
		else if (tree.val < interval.left) {
			helperMethod(tree.right, interval, result);
		}
		
		else {	//interval.right >= tree.val
			helperMethod(tree.left, interval, result);
		}
		
		return result;
	}
}
