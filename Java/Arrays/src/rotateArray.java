/*
 * So, for example,


A : [1 2 3 4 5 6]
B : 1

The output :

[2 3 4 5 6 1]
 */
import java.util.*;
public class rotateArray {
	public ArrayList<Integer> rotate(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (A.size() == 1) {
		    ret.add(A.get(0));
		}
		
		else {
		    
		    int x = 0;
		    
    		for (int i = 0; i < A.size(); i++) {
                
                if ((x + B) >= A.size()) {
                     x = (x+B)%A.size() - B;
                }
               
            	ret.add(A.get(x + B));
            	x++;

    		}		    
		}
		return ret;
	}
}
