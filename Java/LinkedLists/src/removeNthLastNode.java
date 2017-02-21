
public class removeNthLastNode {
	
	// Assume 1 -> 2 -> 3 -> 4 -> 5, n = 2
	// 1->2->3->5
	public ListNode removeNthFromEnd(ListNode a, int b) {

		if (a == null) {
			return null;	
		}
		
		ListNode fast = a;
		ListNode slow = a;
		
		for (int i = 0; i < b; i++) { //shift fast by b nodes
		    if (fast.next == null) {
		        return a.next;
		    }
			fast = fast.next;
		}
		
		while (fast.next != null) {		//to make fast reach last and slow point to N+1th element
			slow = slow.next;
			fast = fast.next;
		}
		
		//reached N+1th element, remove Nth element
		slow.next = slow.next.next;
		
		return a;
		
	}
	
}
