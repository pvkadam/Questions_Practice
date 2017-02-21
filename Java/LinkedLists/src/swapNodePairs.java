
public class swapNodePairs {
	public ListNode swapPairs(ListNode head) {
	    if(head == null || head.next == null)   
	        return head;
	 
	    ListNode start = new ListNode(0);
	    start.next = head;
	    
	    ListNode current = start;
	    while (current.next != null && current.next.next != null) {
	    	current.next = swap (current.next, current.next.next);
	    	current = current.next.next;
	    }	    
	    return start.next;

	}
	
	public ListNode swap(ListNode node1, ListNode node2) {
		node1.next = node2.next;
		node2.next = node1;
		return node2;
	}
}
