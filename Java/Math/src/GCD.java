import java.util.*;

public class GCD {
	public static int gcd(int a, int b) {
	    
	    ArrayList<Integer> listForA = new ArrayList<Integer>();
	    ArrayList<Integer> listForB = new ArrayList<Integer>();

	    
	    if (a > 0 && b > 0) {
	        
	        //for a
	        for (int i = 1; i <= (int) Math.sqrt(a); i++) {
	            if (a%i == 0) {
	                listForA.add(i);
	                
	                if (i != a/i) {
	                    listForA.add(a/i);
	                }
	            }
	        }
	        
	        Collections.sort(listForA);
	        System.out.println("List of factors for a: ");
	        for (int i = 0; i < listForA.size(); i++) {
	        	System.out.print(listForA.get(i) + " ");
	        }
	        System.out.println("------------------ ");
	        
	        //for b
	        for (int i = 1; i <= (int) Math.sqrt(b); i++) {
	            if (b%i == 0) {
	                listForB.add(i);
	                
	                if (i != b/i) {
	                    listForB.add(b/i);
	                }
	            }
	        }
	        
	        Collections.sort(listForB);
	        System.out.println("List of factors for b: ");
	        for (int i = 0; i < listForB.size(); i++) {
	        	System.out.print(listForB.get(i) + " ");
	        }
	        System.out.println("------------------ ");
	        
	        
		    ArrayList<Integer> commonElements = new ArrayList<Integer>(listForA);
		    commonElements.retainAll(listForB);
		    
		    System.out.println(Collections.max(commonElements));
		    return Collections.max(commonElements);
	        
	    }
	    
	    else if (a == 1 && b == 1) {
	        return 1;
	    }
	    
	    return 0;
	    
	}
	
	public static void main (String[] args) {
		gcd(100,30);
	}
}
