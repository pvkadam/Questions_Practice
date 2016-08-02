import java.util.*;
/*
 * (1) first for each node in list, copy it, store the original node to new node mapping in hashmap

(2)Still for each node in original list, if its random attribute is not null,
 change the corresponding new node's random attribute based on the hashmap.
 */
public class CopyList {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null)
			return null;
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.label);
	 
		RandomListNode p = head;
		RandomListNode q = newHead;
		map.put(head, newHead);
	 
		p = p.next;
		while (p != null) {
			RandomListNode temp = new RandomListNode(p.label);
			map.put(p, temp);
			q.next = temp;
			q = temp;
			p = p.next;
		}
	 
		p = head;
		q = newHead;
		while (p != null) {
			if (p.random != null)
				q.random = map.get(p.random);
			else
				q.random = null;
	 
			p = p.next;
			q = q.next;
		}
	 
		return newHead;
	}
}
