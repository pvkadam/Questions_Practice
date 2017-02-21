import java.util.*;
public class largestRectangleInHistogram {
	public static int largestRectangleArea(ArrayList<Integer> a) {	   
		
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
	    		System.out.println("height " + height);
	    		int width = stack.isEmpty() ? index : index - stack.peek() - 1;
	    		System.out.println("width " + width);
	    		areaMax = Math.max(areaMax, height*width);
	    		System.out.println("areaMax " + areaMax);
	    		System.out.println("----------");
	    	}
	    }
	    
	    while (!stack.isEmpty()) {
    		int height = a.get(stack.pop());
    		System.out.println("height " + height);
    		int width = stack.isEmpty() ? index : index - stack.peek() - 1;
    		System.out.println("width " + width);
    		
    		areaMax = Math.max(areaMax, height*width);
    		System.out.println("areaMax " + areaMax);
    		System.out.println("----------");
	    }
	    
	    return areaMax;
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer> ();
		a.add(2);
		a.add(1);
		a.add(5);
		a.add(6);
		a.add(2);
		a.add(3);
		largestRectangleArea(a);
		
	}
}
