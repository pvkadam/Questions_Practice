import java.util.*;

public class preorderIterative {
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(a == null) {
            return result;
        }

        stack.push(a);
        
        while(!stack.isEmpty()){
            TreeNode popped = stack.pop();
            result.add(popped.val);
            
            if(popped.right != null) {		//first push right and then left!!
                stack.push(popped.right);
            }

            if(popped.left != null) {
            	stack.push(popped.left);
            }        
        }
        
        return result;
	}
}
