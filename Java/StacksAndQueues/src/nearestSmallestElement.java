import java.util.*;
/*
 * Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.

More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is maximum possible AND 
    j < i AND
    A[j] < A[i]
Elements for which no smaller element exist, consider next smaller element as -1.

Example:

Input : A : [4, 5, 2, 10]
Return : [-1, 4, -1, 2]

Example 2:

Input : A : [3, 2, 1]
Return : [-1, -1, -1]
 */
public class nearestSmallestElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> a) {
        
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < a.size(); i++) {  
            
            while(!stack.isEmpty() && stack.peek() >= a.get(i)) {                
                stack.pop();                
            }
            
            if(stack.isEmpty()) {
                result.add(-1); 
            }
                            
            else {
                result.add(stack.peek());
            }
                
            stack.push(a.get(i));
            
        }
        
        return result;
        
    }
}