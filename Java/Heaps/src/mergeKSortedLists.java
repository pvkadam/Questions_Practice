import java.util.*;
/*
 * Merge k sorted linked lists and return it as one sorted list.

Example :

1 -> 10 -> 20
4 -> 11 -> 13
3 -> 8 -> 9
will result in

1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
 */

/*
 * Insert all k elements at position 1 from each list into a heap. 
 * Use EXTRACT-MIN to obtain the smallest element (say x) of the heap. 
Say then x came from list i, then take the next element from list i and insert it 
into the heap. 
 */
public class mergeKSortedLists {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    if(a.size() == 0)
	        return null;
	 
	    PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(a.size(), new Comparator<ListNode>(){
	        public int compare(ListNode l1, ListNode l2){
	        	//(return -1 for less-than; return 1 for greater-than; return 0 for equal.)
	            return l1.val - l2.val;
	        }
	    });
	 
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    for(ListNode list: a){
	        if(list!=null)
	            queue.offer(list);
	    }    
	 
	    while(!queue.isEmpty()){
	        ListNode n = queue.poll();		//will return the minimum value
	        p.next = n;
	        p=p.next;
	 
	        if(n.next!=null)
	            queue.offer(n.next);
	    }    
	 
	    return head.next;
	 
	}
}
