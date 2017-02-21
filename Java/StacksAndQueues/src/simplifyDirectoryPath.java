import java.util.*;

public class simplifyDirectoryPath {	
	public String simplifyPath(String a) {
		
		/*
		 * 1. Split string with /
		 * 2. Iterate through terms after split
		 * 		1. If term's length is 0 or it's ".", then do nothing
		 * 		2. If term is "..", then check if stack is not empty and then pop
		 * 		3. push for other cases
		 * 3. If stack is empty, return /
		 * 4. Use insert keyword of String and keep inserting at 0 index
		 */
		
		Stack<String> stack = new Stack<String>();	
		String[] array = a.split("/");
		StringBuilder absolutePath = new StringBuilder();
		
		for (String term: array) {
			if (term.length() == 0 || term.equals(".")) {
				//do nothing
			}
			
			else if (term.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
			
			else {
				stack.push(term);
			}
		}
		
		
		//return the String
		if (stack.isEmpty()) {
			return "/";
		}
		
		//keep inserting at index 0
		while (!stack.isEmpty()) {
			absolutePath.insert(0, stack.pop());
			absolutePath.insert(0, "/");
		}
		
		return absolutePath.toString();
		
	}
}
