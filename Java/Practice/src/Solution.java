import java.util.*;

public class Solution {
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 int direction = 0;
		 
		 /*
		 *  0 for left to right
		 *  1 for top to bottom
		 *  2 for right to left
		 *  3 for bottom to top
		 */
		 
		 int topRow = 0;
		 int bottomRow = a.size() - 1;
		 
		 int leftColumn = 0;
		 int rightColumn = a.get(0).size() - 1;
		 
		 
		 while (topRow <= bottomRow && leftColumn <= rightColumn) {
		     
		     if (direction == 0) {
		       for (int i = leftColumn; i <= rightColumn; i++) {
		           result.add(a.get(topRow).get(i));
		           
		       }  
		       
		       topRow++;
		       direction = 1;
		     }
		     
		     else if (direction == 1) {
		         for (int i = topRow; i <= bottomRow; i++) {
		             result.add(a.get(rightColumn).get(i));
		             
		         }
		         
		         rightColumn--;
		         direction = 2;
		     }
		     
		     else if (direction == 2) {
		         for (int i = rightColumn; i>= leftColumn; i--) {
		             result.add(a.get(bottomRow).get(i));
		            
		         }
		         
		         bottomRow--;
		         direction = 3;
		     }
		     
		     else if (direction == 3) {
		         for (int i = bottomRow; i >= topRow; i--) {
		             result.add(a.get(leftColumn).get(i));
		             
		         }
		         
		         leftColumn++;
		         direction = 0;
		     }
		   
		     
		 }
		 
		 
		 for (int i = 0; i < result.size(); i++) {
			 System.out.println(result.get(i));
		 }
		 
		 return result;
	}
	
	public static void main (String[] args) {
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		
		row1.add(1);
		row1.add(2);
		row2.add(3);
		row2.add(4);
		row3.add(5);
		row3.add(6);
		
		
		
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		
		spiralOrder(list);
		
	}
}
