import java.util.*;

/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
									 * 	1
									   / \
									  2   2
									 / \ / \
									3  4 4  3

 */
public class symmetricBinaryTree {
	
	public int isSymmetric(TreeNode a) {
		
		if (a == null) {
			return 1;
		}
		
		return checkSymmetry(a.left, a.right);
	}
	
	
	public int checkSymmetry(TreeNode subTreeLeft, TreeNode subTreeRight) {
		if (subTreeLeft == null && subTreeRight == null) {
			return 1;
		}
		
		if (subTreeLeft != null && subTreeRight != null) {	//if the subtree doesn't have equal sub nodes
			if (subTreeLeft.val == subTreeRight.val) {
				if (checkSymmetry(subTreeLeft.left, subTreeRight.right) == 1) {
					if (checkSymmetry(subTreeLeft.right,subTreeRight.left) == 1) {
						return 1;
					}
				}
			}
		}

		return 0;
	}
}
