package binarySearchTree;
import java.util.*;

public class minimumHeightBSTFromSortedArray {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		if (a.size() == 0) {
			return null;
		}
		
		return helperMethod(a, 0, a.size() -1);
	}
	
	public TreeNode helperMethod(List<Integer> a, int startIndex, int endIndex) {
		
		if(startIndex > endIndex) {
			return null;
		}
		
		int mid = startIndex + (endIndex - startIndex)/2;
		TreeNode node = new TreeNode(a.get(mid));
		node.left = helperMethod(a, startIndex, mid - 1);
		node.right = helperMethod(a, mid + 1, endIndex);
		
		return node;
	}
}
