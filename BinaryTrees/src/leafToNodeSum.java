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
	
	
	//if the binary tree contains binary values 
	//trick is to define path as 10 * path + next value
	//if path is 1234. At 123, do 10 * 123 + 4 = 1234
	//keep dividing by 1003 to avoid overflow everywhere
	public int sumNumbers(TreeNode a) {
		
		return helperSumNumber(a, 0) % 1003;
	}
	
	public int helperSumNumber(TreeNode a, int pathSum) {
		if (a == null) {
			return 0;
		}
		
		pathSum = (pathSum*10 + a.val)%1003;
		
		if (a.left == null && a.right == null) {
			return pathSum % 1003;
		}
		
		return (helperSumNumber(a.left, pathSum) + helperSumNumber(a.right, pathSum)) % 1003;
	}
	
}
