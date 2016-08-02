/*
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 Example :
 Given
 
 
 1
 / \
 2   5
 / \   \
 3   4   6
 The flattened tree should look like:
 
 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 Note that the left child of all nodes should be NULL.
 */

import java.util.*;
public class flattenBinaryTreeToLinkedList {
    public TreeNode flatten(TreeNode a) {
    	
    	/*
    	 * Define result as null and set current to result. Keep storing values to current.right and return result.right
    	 * Use stack to store results of tree. First push the whole tree.
    	 * Until stack is empty, pop the last element and set it as right of current. 
    	 * Then push right side of the tree and then left side of the tree. 
    	 */
    	TreeNode result = new TreeNode(0);
        TreeNode current = result;

        if (a == null) {
        	return null;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(a);
        
        while (!stack.isEmpty()) {
        	TreeNode poppedNode = stack.pop();
        	current.right = poppedNode;
        	current.left = null;
        	
        	current = current.right;
        	
        	if (poppedNode.right != null) {
        		stack.push(poppedNode.right);
        	}
        	
        	if (poppedNode.left != null) {
        		stack.push(poppedNode.left);
        	}
        	
        }
        
        return result.right;

    }
}
