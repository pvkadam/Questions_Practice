/*
 * Given an index k, return the kth row of the Pascal's triangle. 
 * For example, when k = 3, the row is [1,3,3,1].
 */
import java.util.*;

public class kthRowPascalTriangle {
    public ArrayList<Integer> getRow(int rowIndex) {
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	result.add(1);
    	
    	for (int i = 0; i < rowIndex; i++) {
    	    result.add(result.get(i)*(rowIndex-i)/(i+1));
    	}
    	
    	return result;
    }
}
