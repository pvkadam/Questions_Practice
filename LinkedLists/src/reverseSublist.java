
public class reverseSublist {


	static ListNode head;
	static ListNode current;
	
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    
		if (m == n) {
			return a;	//no need to reverse the list
		}
		
		ListNode head = new ListNode(0);
		head.next = a;
		ListNode subListHead = head;
		
		for (int i = 1; i < m; i++) {
		    subListHead = subListHead.next;	// at 1
		}
		//reached the starting point of m-1
		
		//now reach m
		ListNode subListIteration = subListHead.next;	//at 2
		
		for (int i = m; i < n; i++) {
			ListNode temp = subListIteration.next;
			subListIteration.next = temp.next;
			temp.next = subListHead.next;
			subListHead.next = temp;
		}
		
		return head.next;
	}
	
	public void add(int data) {
		ListNode node = new ListNode(data);
		
		if (head == null) {
			head = node;
			head.next = null;
		}
		
		else {
			current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.next = null;
		}
	}
	
	public void print() {
		current = head;
		
		while (current!=null) {
			System.out.print(current.val + " --> ");
			current = current.next;
		}
	}
	
	public static void main (String[] args) {
		reverseSublist list = new reverseSublist();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		System.out.println("before: ");
//		list.print();
		list.reverseBetween(head, 2, 4);
//		System.out.println();
//		System.out.println("after: ");
//		list.print();
	}
}
