package binarySearchTree;

/*
 *             100
              /   \
            98    102
           /  \
         96    99
          \
           97
           
           Given 97, you should return the node corresponding to 98 
           as thats the value just greater than 97 in the tree.
 */

public class nextGreaterNumberBST {
	public TreeNode getSuccessor(TreeNode a, int b) {
	    
	    TreeNode currentNode = null;
	    
	    while (a != null) {
	        if (a.val > b) {
	            currentNode = a;
	            a = a.left;
	        }
	        
	        else {
	            a = a.right;
	        }
	    }
	    
	    return currentNode;
	}
}
