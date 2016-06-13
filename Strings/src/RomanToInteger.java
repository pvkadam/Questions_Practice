
public class RomanToInteger {
	public int romanToInt(String a) {
        
        int sum = 0;
        int previousValue = 0;
        
        if (a.length() == 0) {
        	return 0;
        }
        
        a.toUpperCase();
	   
	    for (int i = a.length() -1; i >= 0; i--) {
	        
	        int currentValue = convertCharacter(a.charAt(i));
	        
	        if (i == a.length() -1) {
	        	sum = sum + currentValue;
	        }
	        
	        else {
	        	if (currentValue < previousValue) {
	        		sum = sum - currentValue;
	        	}
	        	
	        	else if (currentValue >= previousValue) {
	        		sum = sum + currentValue;
	        	}
	        }
	        
	        previousValue = currentValue;
	        
	        
	        
	        
	    }
	    
	    return sum;
	    
	}
	
	public int convertCharacter(char a) {
	    switch (a) {
	        case 'I':
	            return 1;

	        case 'V': 
	            return 5;
	            
	        case 'X': 
	            return 10;
	        	            
	        case 'L': 
	            return 50;
	            
	        case 'C':
	            return 100;
	        
	        case 'D':
	            return 500;
	            
	        case 'M':
	            return 1000;
	            
	        default:
	            return 0;
	    }
	}
}
