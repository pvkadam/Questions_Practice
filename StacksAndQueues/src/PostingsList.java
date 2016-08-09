import java.util.*;

/*
 * Take a posting's list and compute the jump-firsr order. Assume each node has an integer-value
 * field that holds the order, and is initialized to -1. 
 * PostingListNode, which has 3 inputs of order, jumpNode, and nextNode, is defined as separate class
 */

public class PostingsList {
	
	public static void computeJumpOrder(postingListNode head) {
		Stack<postingListNode> stack = new Stack<postingListNode>();
		
		int order = 0;
		stack.push(head);
		
		while (!stack.isEmpty()) {
			postingListNode current = stack.pop();
			
			if (current != null && current.order == -1) {
				current.order = order++;
				stack.push(current.nextNode);
				stack.push(current.jumpNode);
			}
		}
	}
}
