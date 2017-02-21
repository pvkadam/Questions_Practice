/*
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
 */
import java.util.*;

public class setMatrixZeroes {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    
	    int row = a.size();
	    int column = a.get(0).size();
	    
	    
        boolean[] rowZero = new boolean[row];
        boolean[] columnZero = new boolean[column];
        
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    rowZero[i] = true;
                    columnZero[j] = true;
                    
                }
            }
        }
        
        for (int i = 0; i < row; i++) {
            if (rowZero[i]) {
                
                for (int j = 0; j < column; j++) {
                    a.get(i).set(j, 0);
                }
            }
        }
        
        for (int i = 0; i < column; i++) {
            if (columnZero[i]) {
                
                for (int j = 0; j < row; j++) {
                    a.get(j).set(i, 0);
                }
            }
        }
        
	}
}
