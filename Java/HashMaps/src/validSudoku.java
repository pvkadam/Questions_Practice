import java.util.*;

public class validSudoku {
    public int isValidSudoku(final List<String> a) {
    	
    	if (a == null) {
    		return 0;
    	}
    	
    	HashSet<Character> set = new HashSet<Character>();
    	
    	//check row
    	for (int i = 0; i < a.size(); i++) {
    		set.clear();
    		for (int j = 0; j < a.get(i).length(); j++) {
    			char c = a.get(i).charAt(j);
    			
    			if (c != '.') {
    				if (set.contains(c)) {
    					return 0;
    				}
    				
    				set.add(c);			
    			}
    		}
    	}

    	//check column
    	
    	for (int i = 0; i < 9; i++) {
    		set.clear();
    		for (int j = 0; j < 9; j++) {
    			char c = a.get(j).charAt(i);
    			
    			if (c != '.') {
    				if (set.contains(c)) {
    					return 0;
    				}
    				
    				set.add(c);			
    			}
    		}
    	}  	
    	
    	//check box
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
    			set.clear();
    			
    			for (int k = 0; k < 3; k++) {
    				for (int m = 0; m < 3; m++) {
    					if (a.get(k + i*3).charAt(m + j*3) != '.') {
    						if (set.contains(a.get(k + i*3).charAt(m + j*3))) {
    							return 0;
    						}
    						
    						set.add(a.get(k + i*3).charAt(m + j*3));
    					}
    				}
    			}
    		}
    	}
    	
    	return 1;
    	
    }
}
