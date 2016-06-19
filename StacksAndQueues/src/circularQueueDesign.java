import java.util.*;

/*
 * Design circular queue using arrays:
 * 	1. constructor function which takes the initial capacity of the array
 * 	2. Enqueue
 * 	3. Dequeue
 * 	4. Size of queue
 */

public class circularQueueDesign {
	int head = 0;
	int tail = 0;
	int numberOfElements = 0;
	int sizeOfArray;
	final int scaleFactor = 2;
	
	
	circularQueueDesign(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
	}
	
	int[] array = new int[sizeOfArray];
	
	public void enqueue(int x) {
		if (array.length == numberOfElements) {
			//rotate the array about head and reset head and tail
			Collections.rotate(Arrays.asList(array), -head);
			head = 0;
			tail = numberOfElements;
			array = Arrays.copyOf(array, sizeOfArray * scaleFactor);
			
		}
		
		numberOfElements++;
		array[tail] = x;
		tail = (tail + 1) % array.length;
		
	}
	
	public int dequeue() {
		int result;
		if (numberOfElements == 0) {
			System.out.println("No elements in queue");	
			return -0;		//whatever doesn't matter
			
		}
		else {
			result = array[head];
			head = (head + 1) % array.length;
			numberOfElements--;
			return result;
		}
	}
	
	public int sizeOfQueue() {
		return numberOfElements;
	}
}
