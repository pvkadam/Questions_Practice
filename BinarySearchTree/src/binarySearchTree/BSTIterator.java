package binarySearchTree;
import java.util.*;
public class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    //constructor
    public BSTIterator(TreeNode root) {
        
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }

   /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int result = node.val;
        
        if(node.right != null) {
            node = node.right;
            
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        
        return result;     
    }
}
