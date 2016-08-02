/*
 * Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
 */
public class squareRootOfInteger {
    public int sqrt(int a) {
        
        if(a == 0 || a == 1) {
            return a;
        }
        
        int start = 1, end = a / 2;
        int floor = 0;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(mid == a/mid) {
                return mid;
            }
            
            if(mid < a/mid) {
                start = mid + 1;
                floor = mid;
            } 
            
            else {
                end = mid - 1;
            }
        }

        return floor;
    }
}
