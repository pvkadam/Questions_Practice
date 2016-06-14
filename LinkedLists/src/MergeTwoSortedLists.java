
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		//Create head with null and set current to it
		ListNode head = new ListNode(0);
		
		ListNode current = head;
		
		
		//iterate through a and b
		//check if a is less than b, if yes then set current.next as a
			//else set it to b
		while (a != null & b != null) {
			if (a.val <= b.val) {
				current.next = a;
				a = a.next;
			}
			else {
				current.next = b;
				b = b.next;
			}
			
			current = current.next;
		}
		
		//once it reaches null, just append the remaining part of the other list
		if (a == null) {
			current.next = b;
		}
		
		else if (b == null) {
			current.next = a;
		}
		
		return head.next;
	}	
}
