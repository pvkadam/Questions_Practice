
public class CyclicList {
	public ListNode detectCycle(ListNode a) {
	    
		ListNode fast = a;
		ListNode slow = a;
		
		while (fast != null & fast.next != null & fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (fast == slow) {		//there is a cycle
				slow = a;
				
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return slow;		//cycle starts at slow
			}
		}
		
		return null;	//no cycle
	    
	}
}
