import java.util.*;

public class minStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	int min = -1;
		
	
	//keep adding elements to the stack
	//compare it with minimum element (-1) and update it every time
	public void push(int x) {
		if (stack.isEmpty() || x <= min) {
			stack.push(min);
			min = x;
		}
        stack.push(x);
    }

	//only remove top if min is at top 
    public void pop() {
        if (!stack.isEmpty() && min == stack.pop()) {
        	min = stack.pop();
        }
    }

    //simple top 
    public int top() {
        if (stack.isEmpty()) {
        	return -1;
        }
        return stack.peek();
    }

    	
    //simply return min
    public int getMin() {
        return min;
    }
    
}
