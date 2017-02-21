package binarySearchTree;
import java.util.*;
/*
 * Given a binary tree, return the zigzag level order traversal of its nodes’ values. 
 * (ie, from left to right, then right to left for the next level and alternate between).

Example : 
Given binary tree

    3
   / \
  9  20
    /  \
   15   7
return

[
         [3],
         [20, 9],
         [15, 7]
]
 */

/*
		Create an empty stack s and push root to it.
		while stack is not NULL Do following
		Create a empty stack called tempStack.
		Pop a node from stack and push it to tempStack depending on directionFlag
		Change directionFlag to change the direction of traversal
		set stack=tempStack
*/

public class zigzagTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        
        if(root==null) return result; 
        
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        boolean flag=false; 
        
        while(!stack.isEmpty()) {
            Stack<TreeNode> Tpstack=new Stack<TreeNode>();
            ArrayList<Integer> list=new ArrayList<Integer>();
           
            while(!stack.isEmpty()) {
                TreeNode pop=stack.pop();
                list.add(pop.val); 
               
                if(!flag) {
                    if(pop.left!=null) Tpstack.push(pop.left);
                    if(pop.right!=null) Tpstack.push(pop.right);
                }
                
                else {
                    if(pop.right!=null) Tpstack.push(pop.right);
                    if(pop.left!=null) Tpstack.push(pop.left);
                }
            }
            
            flag=!flag; 
            result.add(list);
            stack=Tpstack; 
        }
        return result; 
    }
}
