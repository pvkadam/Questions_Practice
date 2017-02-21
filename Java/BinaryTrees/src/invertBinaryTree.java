/*
 * Given binary tree

     1
   /   \
  2     3
 / \   / \
4   5 6   7
invert and return

     1
   /   \
  3     2
 / \   / \
7   6 5   4

 */
public class invertBinaryTree {
	   public TreeNode invertTree(TreeNode root) {
	        
	        TreeNode current = root; 
	        
	        if (current == null) {
	            return null;
	        }
	        
	        //swap values
	        TreeNode temp = current.left;
	        current.left = current.right;
	        current.right = temp;
	        
	        //go to next nodes
	        invertTree(current.left);
	        invertTree(current.right);
	        
	    	
	    	return root;
	    	
	    }
    
}
