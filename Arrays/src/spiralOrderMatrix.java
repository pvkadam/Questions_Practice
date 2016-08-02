/*
 * Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]
 */

import java.util.*;

public class spiralOrderMatrix {
		// DO NOT MODIFY THE LIST
		public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
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

			     }
			     
			     else if (direction == 1) {
			         for (int i = topRow; i <= bottomRow; i++) {
			             result.add(a.get(i).get(rightColumn));
			             
			         }
			         
			         rightColumn--;

			     }
			     
			     else if (direction == 2) {
			         for (int i = rightColumn; i>= leftColumn; i--) {
			             result.add(a.get(bottomRow).get(i));
			            
			         }
			         
			         bottomRow--;
		
			     }
			     
			     else if (direction == 3) {
			         for (int i = bottomRow; i >= topRow; i--) {
			             result.add(a.get(i).get(leftColumn));
			             
			         }
			         
			         leftColumn++;
		
			     }
		        
		        direction = (direction + 1)%4;	   
			     
			 }
			 
			 
			 
			 return result;
		}
}
