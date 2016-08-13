//take perfect binary tree and set each node's level-next field to the node on its right
/*
 * 2 cases: see figure 10.6. Check for A and set I as next of B. 
 * Check for B and I, set J as next of F. 
 */
public class rightSiblingTree {
	public void siblingTree(TreeNode tree) {
		TreeNode leftStart = tree;
		while (leftStart != null && leftStart.left != null) {
			generateSiblingTree(leftStart);
			leftStart = leftStart.left;
		}
	}
	
	
	public void generateSiblingTree(TreeNode node) {
		TreeNode iteration = node;
		while (iteration != null) {
			iteration.left.next = iteration.right;
			
			if (iteration.next != null) {
				iteration.right.next = iteration.next.left;
			}
			
			iteration = iteration.next;
		}
	}
}
