import java.util.*;

public class checkParantheses {
	
	/*
	 * Create a hashmap with key as left brackets and value as right brackets
	 * Create stack
	 * 1. Iterate through all characters
	 * 		1. If character is equal to key of map, then push into stack
	 * 		2. If character is equal to value of map, then
	 * 			1. Check if stack is empty and value of corresponding key (stack.peek) is equal to character
	 * 				If yes, then pop last element
	 * 			2. Else return false;
	 * 2. Finally check if list is empty or not
	 * 
	 */
	public int isValid (String a) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		//map.put(key,value)
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < a.length(); i++) {
			char current = a.charAt(i);
			
			if (map.keySet().contains(current)) {
				stack.push(current);
			}
			
			else if (map.values().contains(current)) {
				if (!stack.isEmpty() && map.get(stack.peek()) == current) {
					stack.pop();
				}
				else {
					return 0;
				}
			}
		}
		
		if (stack.isEmpty()) {
			return 1;
		}
		
		return 0;
		
	
	}
}
