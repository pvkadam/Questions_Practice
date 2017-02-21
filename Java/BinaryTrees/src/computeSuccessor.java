//for inorder traversal, compute successor of a given node
/*
 * For inorder, successor must lie in the non-empty right subtree, regardless of the tree structure.
 * Successor will be the first node visited when performing an inorder traversal on that subtree.
 * 
 * If a node does not have a right subtree, if it is a parent's left child, then it's parent will be
 * the successor. 
 * 
 * If node is it's parent's right child, then we have already visited the parent. Iteratively follow
 * up to the parents and stop when you move up from a left child. 
 */
public class computeSuccessor {
	
	public TreeNode findSuccessor(TreeNode node) {
		
		TreeNode iteration = node;
		
		//if finding successor of node C or A in tree
		if (iteration.right != null) {	//that means successor is in right subtree
			iteration = iteration.right;
			while (iteration.left != null) {
				iteration = iteration.left;
			}
			return iteration;
		}
		
		//for case G
		if (iteration.parent != null && iteration.parent.right == iteration) {
			iteration = iteration.parent;
		}
		
		return iteration.parent;
	}
}
