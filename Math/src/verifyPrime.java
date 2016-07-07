
public class verifyPrime {
	public int isPrime(int a) {
	    
	    if (a <=1) {
	        return 0;
	    }
	    
	    else {
	        for (int i = 2; i <= (int) Math.sqrt(a); i++) {
	            if (a%i == 0) {
	                return 0;
	            }
	        }
	    }
	    
	    return 1;
	}
}
