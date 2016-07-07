package binarySearchTree;
import java.util.*;

/*
 * Input: inorder[] = {5, 10, 40, 30, 28}
Output: root of following tree
         40
       /   \
      10     30
     /         \
    5          28 

Input: inorder[] = {1, 5, 10, 40, 30, 
                    15, 28, 20}
Output: root of following tree
          40
        /   \
       10     30
      /         \
     5          28
    /          /  \
   1         15    20
 */

public class inorderTraversalToCartesianTree {
	public TreeNode buildTree(ArrayList<Integer> a) {
		
		if (a.size() == 0) {
			return null;
		}
		
		return helperTree(a, 0, a.size() - 1);
	}
	
	public TreeNode helperTree(ArrayList<Integer> a, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}
		
		int maxValue = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		for (int i = startIndex; i <= endIndex; i++) {
			if (maxValue < a.get(i)) {
				maxValue = a.get(i);
				maxIndex = i;
			}
		}
		
		//now it has reached the root (highest value)
		
		TreeNode node = new TreeNode(maxValue);
		
		if (startIndex == endIndex)
			return node;
		
		node.left = helperTree(a, startIndex, maxIndex - 1);
		node.right = helperTree(a, maxIndex + 1, endIndex);
		
		return node;
		
	}
}
