/*
 * 
 */
public class leafToNodeSum {
	
	//if the binary tree contains binary values 
	//trick is to define path as 2 * path + next value
	//if path is 11001. At 1100, do 2 * 1100 (25) + 1 = 11001 (25)
	public int binaryValuedTree(TreeNode tree) {
		return helperbinaryValuedTree(tree, 0);
	}
	
	public int helperbinaryValuedTree(TreeNode tree, int pathSum) {
		if (tree == null) {
			return 0;
		}
		
		
		pathSum = (2*pathSum) + tree.val;
		
		//base case --> at leaf node
		if (tree.left == null && tree.right == null) {
			return pathSum;
		}
		
		return helperbinaryValuedTree(tree.left, pathSum) + helperbinaryValuedTree(tree.right, pathSum); 
		
	}
	
}
