
public class addTwoNumbersAsLists {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		
		/*
		 * 
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
