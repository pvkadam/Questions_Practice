
public class PalindromeLinkedList {
    //divide the linked list into first half and second half
	//reverse the second half 
	//compare first half and the reverse of second half
	
	public int lPalin(ListNode A) {
        
		//to check the middle element of a linkedList
		//for every 2 fast iterations, make 1 slow iteration and return the last slow iteration
		
		ListNode slow = A, fast = A;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		ListNode middle = slow;
		ListNode secondReverse = reverseList(middle);		
		
		//compare reversed second part of the list and 1st part
		while (secondReverse != null && A != null) {
			if (secondReverse.val != A.val) {
				return 0;		//not a palindrome
			}
			secondReverse = secondReverse.next;
			A = A.next;		
		}
		
		return 1;
		   
    }
	
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
