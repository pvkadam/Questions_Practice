
/*
 * Given a binary tree, determine if it is height-balanced.
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem. 
 * Height-balanced binary tree : is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 */

/*
 * 	1. Need to recursively compute left subtree's depth and right subtree's depth
 * 	2. Need to recursively check if the subtrees are balanced or not
 * 	3. Hence 2 recursive methods will have to be implemented
 */

public class heightBalancedTree {
	public int isBalanced(TreeNode a) {
		
		if (a == null) {
			return 1;
		}
		
		int leftDepth = 0;
		int rightDepth = 0;
		
		if (a.left != null) {
			leftDepth = subDepth(a.left);
		}
		
		if (a.right != null) {
			rightDepth = subDepth(a.right);
		}
		
		if (Math.abs(rightDepth- leftDepth) <=1 && isBalanced(a.left) == 1 && isBalanced(a.right) == 1) {
			return 1;
		}
		
		return 0;
	}
	
	public int subDepth(TreeNode node) {
		
		//base case
		if (node == null) {
			return 0;
		}
		
		int maxDepth = Math.max(subDepth(node.left), subDepth(node.right)) + 1;
		return maxDepth;
	}
}
