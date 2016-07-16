import java.util.*;

public class removeDuplicatesFromSortedArray {
	public int removeDuplicates(ArrayList<Integer> a) {
	    
	    if (a.size() == 0) {
	        return 0;
	    }
	    
	    int writeIndex = 1;
	    for (int i = 1; i < a.size(); i++) {
	        if (!a.get(writeIndex -1).equals(a.get(i))) {
	            a.set(writeIndex++, a.get(i));
	        }
	    }
	    
	    return writeIndex;
	}
}
