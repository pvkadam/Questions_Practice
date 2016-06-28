
public class leastCommonAncestor {
	  
	  public int lca(TreeNode a, int val1, int val2) {
		  
		  //to test if the values are present
		  if (valPresent(a, val1) == null || valPresent(a, val2) == null) {
			  return -1;
		  }
		 
		  a = computeLCA(a, val1, val2);
		  
		  if (a == null)
			  return -1;
		
		  return a.val;
	  }
	  
	  public TreeNode computeLCA(TreeNode a, int val1, int val2) {
		
		  //if a's value is equal to one of the values, return that value
		  if (a == null) {
			  return null; 
		  }
			
		  if (a.val == val1 || a.val == val2) {
			  return a;
		  }

		  TreeNode leftLCA = computeLCA(a.left, val1, val2);
		  TreeNode rightLCA = computeLCA(a.right, val1, val2);
		  
		  //if leftNode and rightNode are not null, then both values are present. Hence, the common element
		  //will be the root a
		  if (leftLCA != null && rightLCA != null) {
			  return a;
		  }

		  return (leftLCA != null) ? leftLCA: rightLCA;
		  
	  }
	  
//-----------------------------------------------------------------------------------------------------	  
//JUST TO TEST IF THE VALUES ARE PRESENT
	  
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
