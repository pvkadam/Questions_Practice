package binarySearchTree;

public class findElement {
	public TreeNode findKey(TreeNode tree, int x) {
		if (x == tree.val) {
			return tree;
		}
		
		return x > tree.val ? tree.right: tree.left;
		
	}
}
