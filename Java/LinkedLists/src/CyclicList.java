import java.util.*;

public class CyclicList {
	
	//Also known as Floyd's cycle finding algorithm
	public ListNode detectCycle(ListNode A) {

	    HashSet<ListNode> hashSet = new HashSet<ListNode>();
	    
	    while (A != null) {
	        if (hashSet.contains(A)) {
	            return A;
	        } else {
	            hashSet.add(A);
	        }
	        A = A.next;
	    }
	    
	    return null;
	}
	   
}
