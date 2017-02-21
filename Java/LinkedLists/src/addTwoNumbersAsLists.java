
public class addTwoNumbersAsLists {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		
		/*
		 * 	Define carry and newHead and 3 pointers: p1 for a, p2 for b, and p3 for newHead
		 *  While p1 or p2 is not equal to null
		 *  	If p1 is not equal to null, add value to carry and shift to next
		 *  	If p2 is not equal to null, add value to carry and shift to next
		 *  	Create new next for p3 with remainder of carry with 10
		 *  	Reset carry with carry / 10
		 *  	Shift p3 to next p3
		 *  
		 *  If the last carry is 1, then create a new next for p3 and store 1 in that
		 *  Return newHead.next
		 */
		
		int carry = 0;
		ListNode dummyHead = new ListNode(0);
		ListNode iteration = dummyHead;
		
		while (a != null || b != null) {
		    int sum = carry;
		    
		    if (a != null) {
		        sum += a.val;
		        a = a.next;
		    }
		    
		    if (b != null) {
		        sum += b.val;
		        b = b.next;
		    }
		    
		    iteration.next = new ListNode(sum % 10);
		    carry = sum / 10;
            iteration = iteration.next;
            
		}
		
		//for the last MSB
		if (carry == 1) {
		    iteration.next = new ListNode(carry); 
		}
		
		return dummyHead.next;
		
	}
}
