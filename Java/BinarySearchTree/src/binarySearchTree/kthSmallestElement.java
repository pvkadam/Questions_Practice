package binarySearchTree;

/*
								 * Input : 
								  2
								 / \
								1   3
								
								and k = 2
								
								Return : 2
								
								As 2 is the second smallest element in the tree.
 */

public class kthSmallestElement {
	public int kthSmallest(TreeNode root, int k) {
		if (root == null) {
			return -1;
		}
		
		int numberOfLeftNodes = numberOfNodes(root.left);
		
		if (numberOfLeftNodes == k - 1) {
			return root.val;
		}
		
		else if (numberOfLeftNodes < k - 1) {
			return kthSmallest(root.right, k - numberOfLeftNodes - 1);
		}
		
		else {
			return kthSmallest(root.left, k);
		}	
		
	}
	
	
	public int numberOfNodes(TreeNode node) {
		if (node == null) {
			return 0;
		}
		
		return numberOfNodes(node.left) + numberOfNodes(node.right) + 1;	
	}
}
