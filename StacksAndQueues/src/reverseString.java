import java.util.*;

public class reverseString {
	
	/*
	 * Simple one: first push all the elements on stack and then pop one by one and append to result string
	 */
	public String reverseString(String a) {
	    
	    Stack <Character> stack = new Stack<Character>();
	    
	    for (int i = 0; i < a.length(); i++) {
	    	stack.push(a.charAt(i));
	    }
	    String result = "";
	    while (!stack.isEmpty()) {
	    	result += stack.pop();
	    }
	    
	    return result;
	}
}
