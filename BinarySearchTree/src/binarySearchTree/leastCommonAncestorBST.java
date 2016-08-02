package binarySearchTree;

/* ASSUME THAT a is less than b!!!!!
 * three cases:
 * if a < root < b --> result is root
 * if a && b < root --> left subtree
 * if a && b > root --> right subtree
 * 
 */
public class leastCommonAncestorBST {
	public TreeNode lca(TreeNode tree, int a, int b) {
		TreeNode root = tree;
		
		if (root.val > a && root.val < b) {
			return root;
		}
		
		//must lie in the left subtree
		else if (root.val > a && root.val > b) {
			lca(tree.left, a, b);
		}
		
		else if (root.val < a && root.val < b) {
			lca(tree.right, a, b);
		}
		
		return root;
	}
}
