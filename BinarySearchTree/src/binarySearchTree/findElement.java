package binarySearchTree;

/*
 * http://quiz.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 */

public class findElement {
	public TreeNode findKey(TreeNode tree, int x) {
		if (tree == null || x == tree.val) {
			return tree;
		}
		
		return x > tree.val ? findKey(tree.right, x): findKey(tree.left, x);
		
	}
}
