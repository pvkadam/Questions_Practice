
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
		
		ListNode newHead = new ListNode(0);
		ListNode p1 = a, p2 = b, p3 = newHead;
		
		while (p1 != null || p2 != null) {
			if (p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			
			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			
			p3.next = new ListNode(carry%10);
			p3 = p3.next;
			carry /= 10;
		}
		
		if (carry == 1) 
			p3.next = new ListNode(1);
		
		return newHead.next;
		
	}
}
