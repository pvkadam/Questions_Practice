public class powerFunction {

	/*
    *   If x == 0, return 0
    *   Define result as 1 and remainder as x % d
    *   while n > 0    
    */
    public int pow(int x, int n, int d) {
    

        if (x == 0) {
            return 0;
        }

        long remainder = x % d;
        long result = 1;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * remainder) % d;
            }
            n /= 2;
            remainder = (remainder * remainder) % d;
        }

        if (result < 0) {
            return (int) ((result + d) % d);
        } 

        else {
            return (int) result;
        }
	    
	}
}
