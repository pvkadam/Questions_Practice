import java.util.*;
public class constructTreeFromPreOrderAndInorder {
	public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
	    int preStart = 0;
	    int preEnd = preorder.size()-1;
	    int inStart = 0;
	    int inEnd = inorder.size()-1;
	 
	    return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
	}
	 
	public TreeNode construct(ArrayList<Integer> preorder, int preStart, int preEnd, ArrayList<Integer> inorder, int inStart, int inEnd){
	    if(preStart>preEnd||inStart>inEnd){
	        return null;
	    }
	 
	    int val = preorder.get(preStart);
	    TreeNode p = new TreeNode(val);
	 
	    //find parent element index from inorder
	    int k=0;
	    for(int i=0; i<inorder.size(); i++){
	        if(val == inorder.get(i)){
	            k=i;
	            break;
	        }
	    }
	    //IMPORTANT TO UNDERSTAND THIS
	    p.left = construct(preorder, preStart+1, preStart+(k-inStart), inorder, inStart, k-1);
	    p.right= construct(preorder, preStart+(k-inStart)+1, preEnd, inorder, k+1 , inEnd);
	 
	    return p;
	}
}