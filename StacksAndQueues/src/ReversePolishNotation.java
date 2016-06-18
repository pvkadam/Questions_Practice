import java.util.*;

public class ReversePolishNotation {
	
	/*
	 * Define stack with integer type
	 * 	1. Iterate string i through the arraylist (if it's a string, then split the string with ',' and store values in an array)
	 * 		1. If length of string == 1 (to make sure that it's not a negative number which has more than 1 length)
	 * 			1. If first character is +-* or divide
	 * 				1. Pop twice (second and first integer)
	 * 				2. Perform operations according to the operator using switch case
	 * 		2. Else it is an integer and just push it 
	 * 	2. Return the pop 
	 */
	
	public int evalRPN(ArrayList<String> a) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (String i: a) {
			
			//operator
			if (i.length() == 1 && ((i.charAt(0) == '+') || (i.charAt(0) == '-') || (i.charAt(0) == '*') || (i.charAt(0) == '/'))) {
				int secondNumber = stack.pop();
				int firstNumber = stack.pop();
				
				switch (i.charAt(0)) {
				
					case '+': 
						stack.push(firstNumber + secondNumber);
						break;

					case '-': 
						stack.push(firstNumber - secondNumber);
						break;
						
					case '*': 
						stack.push(firstNumber * secondNumber);
						break;
						
					case '/': 
						if (secondNumber == 0) {
							break;
						}
						stack.push(firstNumber / secondNumber);	
						break;
				}
			}
			
			//it's a number
			else {
				stack.push(Integer.parseInt(i));
			}
			
		}
		
		return stack.pop();
	}
}
