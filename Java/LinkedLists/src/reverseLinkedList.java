
public class reverseLinkedList {
	public ListNode reverseList(ListNode a) {
		ListNode current, previous, nextNode;
		//current used for traversal 
		//previous used to change the link
		//nextNode for storing the nextNode
		
		current = a;
		previous = null;
		
		
		while (current != null) {
			nextNode = current.next;	//save next node of current
			current.next = previous;	//copy previous node value into current.next
			
			previous = current;			//save current value into previous to pass it on later
			current = nextNode;			//iterate
		}
		
		a = previous;					//set it back to node
		return a;
	    
	}
}
