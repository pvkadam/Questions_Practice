import java.util.*;
public class IntersectionOfLinkedLists {
	
	//Time complexity --> O(n)
	//Memory space: O(1)
	
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    
		int sizeOfA = length(a);
		int sizeOfB = length(b);
		
		int difference = sizeOfB - sizeOfA;	//assuming b is greater than a in length
		
		if (sizeOfA > sizeOfB) {	//if a is greater than b in length
			ListNode temp = a;
			a = b;
			b = temp;
			difference = sizeOfA - sizeOfB;
			
		}
		
		//now to make the lists with the same length, shift by d
		for (int i = 0; i < difference; i++) {
			b = b.next;
		}
		
		while (a != null && b != null) {
			if (a == b) {
				return a;
			}
			
			a = a.next;
			b = b.next;
		}
	    
		return null;
	}
	
	
	public int length(ListNode a) {
		int length = 0;
		
		while (a != null) {
			a = a.next;
			length++;
		}
		return length;
	}

	
	

}
