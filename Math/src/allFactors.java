import java.util.*;

public class allFactors {
	public ArrayList<Integer> allFactors(int a) {
	    
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    for (int i = 1; i <= (int) Math.sqrt(a); i++) {
	        if (a%i == 0) {
	            list.add(i);
	            
	            if (i != a/i) {
	                list.add(a/i);
	            }
	        }
	    }
	    
	    Collections.sort(list);
	    
	    return list;
	}
}
