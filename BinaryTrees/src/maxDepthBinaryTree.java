
public class maxDepthBinaryTree {
	public int maxDepth(TreeNode a) {
		if (a == null) {
			return 0;
		}
		
		return 1 + Math.min(maxDepth(a.left), maxDepth(a.right));
	}
}
