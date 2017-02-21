
public class reverseSublist {


	static ListNode head;
	static ListNode current;
	
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    
		if (m == n) {
			return a;	//no need to reverse the list
		}
		
		ListNode head = new ListNode(0);
		head.next = a;
		ListNode current = head;
		
		for (int i = 1; i < m; i++) {
			current = current.next;	// at 1
		}
		//reached the starting point of m-1
		
		//now reach m
		ListNode iteration = current.next;	//at 2
		System.out.println("iteration  " + iteration.val);
		System.out.println("------------");
		for (int i = m; i < n; i++) {
			ListNode Next = iteration.next;
			System.out.println("Next " + Next.val);
			iteration.next = Next.next;
			System.out.println("iteration.next " + iteration.next.val);
			Next.next = current.next;
			System.out.println("Next.next " + Next.next.val);
			current.next = Next;
			System.out.println("current.next " + current.next.val);
			System.out.println("------------");
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
		list.add(6);
		
//		System.out.println("before: ");
//		list.print();
		list.reverseBetween(head, 2, 4);
		list.print();
//		System.out.println();
//		System.out.println("after: ");
//		list.print();
	}
}
