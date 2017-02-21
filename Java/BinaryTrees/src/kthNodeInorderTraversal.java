//Find kth node appearing in inorder traversal given that each node stores the number of nodes in the
//subtree rooted at that node
/*
 * if k is greater than the number of nodes in the left subtree, the kth node cannot lie in the left subtree
 * If left subtree has L nodes, then kth node in original tree is (k-L)th node when we skip the left subtree. 
 * see figure 10.1 in EPI book 
 * if k <= L, then node is in that subtree
 * ASSUME THAT VAL stores number of nodes in the subtree
 */

public class kthNodeInorderTraversal {
	public TreeNode findkthNode(TreeNode tree, int k) {
		TreeNode iteration = tree;
		while (iteration != null) {
			int leftSize = iteration.left != null ? iteration.val: 0;	//L nodes
			
			if (k > leftSize + 1) {	//that means kth node is not in this subtree, it must be in the right subtree
				k = k - (leftSize + 1);
				iteration = iteration.right;
			}
			
			else if (leftSize + 1 == k) {
				return iteration;
			}
			
			else {		//that means kth node is in the same subtree
				iteration = iteration.left;
			}
			
		}
		return null;
	}
}
