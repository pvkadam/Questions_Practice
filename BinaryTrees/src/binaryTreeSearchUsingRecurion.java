
public class binaryTreeSearchUsingRecurion {
	  public TreeNode valPresent(TreeNode a, int val) {
		  
		  TreeNode result = null;
		 
		  if (a == null) {
			  return null;
		  }
		  
		  if (a.val == val) {
			  return a;
		  }
		  
		  if (a.left != null) {
			  result = valPresent(a.left, val);
		  }
		  
		  if (result == null) {
			  result = valPresent(a.right, val);
		  }
		  
		  return result;	  
	  }
}
