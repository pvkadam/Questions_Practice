package binarySearchTree;
import java.util.*;

public class validBST {
	public int isValidBST(TreeNode tree) {
		if (isValidBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			return 1;
		}
		
		return 0;
	}
	
	public boolean isValidBST(TreeNode tree, Integer minimum, Integer maximum) {
		if (tree == null) {
			return true;
		}
		
		if (tree.val <= minimum || tree.val >= maximum) {
			return false;
		}
		
		return isValidBST(tree.left, minimum, tree.val) && isValidBST(tree.right, tree.val, maximum);
		
	}
	
}
