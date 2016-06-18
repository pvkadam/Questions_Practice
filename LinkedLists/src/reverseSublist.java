
public class reverseSublist {
	public ListNode reverseBetween(ListNode a, int m, int n) {
		
		ListNode head = a;
		ListNode subListHead = head;
		
		if (m == n) {
			return a;	//no need to reverse the list
		}
		
		int i = 1;
		
		while (i++ < m) {
			subListHead = subListHead.next;
			
		}
		//reached the starting point of m
		
		//now reverse the list
		ListNode subListIteration = subListHead.next;
		
		while (m++ < n) {
			ListNode temp = subListIteration.next;
			subListIteration.next = temp.next;
			temp.next = subListHead.next;
			subListHead.next = temp;
		}
		
		return head.next;
	}
}
