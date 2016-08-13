import java.util.ArrayList;
import java.util.Stack;

public class postorderIterative {

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
	       
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> resultStack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        stack1.push(root);
        //doing in reverse, first push root, left, and then right 
        
        while(!stack1.isEmpty()) {
            root = stack1.pop();
            resultStack.push(root);
            
            if(root.left != null) {
                stack1.push(root.left);
            }
            
            if(root.right != null){
                stack1.push(root.right);
            }
            
            
        }
        //reverse of root, left and right 
        while(!resultStack.isEmpty()){
            result.add(resultStack.pop().val);
        }
        
        return result;
	}
}
