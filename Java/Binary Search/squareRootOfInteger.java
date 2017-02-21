/*
 * Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
 */
public class squareRootOfInteger {
    public static int sqrt(int a) {
        
        if(a == 0 || a == 1) {
            return a;
        }
        
        int start = 1, end = a / 2;
        int floor = 0;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid is " + mid);
            
            if(mid*mid == a) {
          
            	return mid;
            }
            
            if(mid > a/mid) {
                end = mid - 1;
            } 
             
            else {
                start = mid + 1;
                floor = mid;
                System.out.println(floor);
            }
            System.out.println("----------");
        }

        System.out.println("final answer " + floor);
        return floor;
    }
    
    public static void main (String[] args) {
    	sqrt(27);
    }
}
