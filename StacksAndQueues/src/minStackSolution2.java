import java.util.Stack;


public class minStackSolution2 {
	private static Stack<Integer> stack = new Stack<Integer>();
    private static Stack<Integer> minStack = new Stack<Integer>();;
    

    
    public static void push(int x) {
    	stack.push(x);
        
        
        if (minStack.isEmpty())
            minStack.push(x);
        
        else if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public static void pop() {
        if (stack.isEmpty())
            return;
        int num = stack.pop();
        if (num == minStack.peek())
            minStack.pop();
        	System.out.println(minStack.pop());
    }

    public static int top() {
        if (stack.isEmpty())
            return -1;
        
        System.out.println(stack.peek());
        return stack.peek();
        
    }

    public static int getMin() {
        if (minStack.isEmpty())
            return -1;
        
        return minStack.peek();
    }
}
