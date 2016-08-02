
public class identicalBinaryTrees {
	public int isSameTree(TreeNode a, TreeNode b) {
		if (a == null & b == null) {
			return 1;
		}
		
		if (a == null || b == null) {
			return 0;
		}
		
		if (a.val == b.val && isSameTree(a.left, b.left) ==1 && isSameTree(a.right, b.right) == 1) {
			return 1;
		}
		
		return 0;	
	}
}
