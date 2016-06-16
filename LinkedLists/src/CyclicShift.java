
public class CyclicShift {
	
	// Assume 1 -> 2 -> 3 -> 4 -> 5 -> null
	//Want 4 -> 5 -> 1 -> 2 -> 3 -> null
	public ListNode rotateRight(ListNode a, int b) {
	    if (a == null) {
	    	return a;
	    }
	    
	    int length = 1;
	    
	    ListNode tail = a;
	    
	    while (tail.next != null) {
	    	tail = tail.next;
	    	length++;
	    }
	    //tail is at the end node of 5
	    
	    if (b%length == 0) {
	    	return a;
	    }
	    
	    b %= length;
	    
	    
	    int shiftHead = length - b;	//shift new head to this length - b position
	    
	    //given that tail is at the end node, connect it to head again by removing null
	    tail.next = a;	//5 connected to 1
	    
	    ListNode newTail = tail;	//new tail is at 5
	    
	    for (int i = 0; i < shiftHead; i++) {
	    	newTail = newTail.next;
	    }
	    //now new tail is at 3
	    
	    //now set new head to 4
	    ListNode newHead = newTail.next;
	    
	    //set 3's next with null
	    newTail.next = null;
	    
	    return newHead;
	    
	}
}
