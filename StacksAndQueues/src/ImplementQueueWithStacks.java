import java.util.*;
/*
 * 1. Enqueue
 * 2. Dequeue
 * 3. Size
 */

public class ImplementQueueWithStacks {
	
	int numberOfElements = 0;
	Stack<Integer> stackEnqueue = new Stack<Integer>();
	Stack<Integer> stackDequeue = new Stack<Integer>();
	
	public void enqueue(int x) {
		stackEnqueue.push(x);
	}
	
	public int dequeue() {
		if (stackDequeue.isEmpty()) {
			while (!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop());
			}
		}
		
		if (!stackDequeue.isEmpty()) {
			return stackDequeue.pop();
		}
		
		System.out.println("No elements");
		return -0;	//whatever doesn't matter
		
	}
	
	public int sizeOfQueue() {
		return numberOfElements;
	}
}
