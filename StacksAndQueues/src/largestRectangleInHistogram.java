import java.util.*;
public class largestRectangleInHistogram {
	public int largestRectangleArea(ArrayList<Integer> a) {
	   
		
		if (a.size() == 0) {
	    	return 0;
	    }
	    
	    Stack<Integer> stack = new Stack<Integer>();
	    int areaMax = 0;
	    int index = 0;
	    
	    while (index < a.size()) {
	    	//push index to stack when the current height is greater than the previous one
	    	if (stack.isEmpty() || a.get(index) >= a.get(stack.peek())) {
	    		stack.push(index);
	    		index++;
	    	}
	    	
	    	else {
	    		//calculate max value when the current height is less than the previous one
	    		int height = a.get(stack.pop());
	    		int width = stack.isEmpty() ? index : index - stack.peek() - 1;
	    		
	    		areaMax = Math.max(areaMax, height*width);
	    	}
	    }
	    
	    while (!stack.isEmpty()) {
    		int height = a.get(stack.pop());
    		int width = stack.isEmpty() ? index : index - stack.peek() - 1;
    		
    		areaMax = Math.max(areaMax, height*width);
	    }
	    
	    return areaMax;
	}
}
