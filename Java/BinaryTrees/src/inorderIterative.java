import java.util.*;
public class inorderIterative {
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if (a == null) {
		    return result;
		}
		
		TreeNode current = a;
		
		while (current != null) {
			stack.push(current);
			current = current.left;
		}
		
		while (!stack.isEmpty()) {
			current = stack.pop();
			result.add(current.val);
			
			if (current.right != null) {
				current = current.right;
				
				while (current != null) {
					stack.push(current);
					current = current.left;
				}
				
			}		
			
		}
		
		return result;
	}
}
