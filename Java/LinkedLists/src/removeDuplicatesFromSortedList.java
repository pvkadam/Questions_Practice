
public class removeDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode a) {
		
		if (a == null || a.next == null) {
			return a;
		}
		
		//compare current value and next value
			//If same then set current's next as current's next's next
			//Else just go to next value
		
		ListNode current = a;
		
		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		
		return a;
	}
}
