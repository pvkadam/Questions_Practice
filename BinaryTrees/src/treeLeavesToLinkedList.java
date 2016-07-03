import java.util.*;
public class treeLeavesToLinkedList {
	public ArrayList<TreeNode> linkedListOfLeaves(TreeNode tree) {
		ArrayList<TreeNode> leaves = new ArrayList<TreeNode>();
		
		generateLeaves(tree, leaves);
		
		return leaves;
		
	}
	
	public void generateLeaves(TreeNode tree, ArrayList<TreeNode> leaves) {
		if (tree != null) {
			
			if (tree.left == null && tree.right == null) {
				leaves.add(tree);
			}
			
			else {
				generateLeaves(tree.left, leaves);
				generateLeaves(tree.right, leaves);
			}
		}
	}
}
