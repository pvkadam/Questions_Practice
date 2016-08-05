import java.util.TreeMap;


public class RomanToInteger {
	public static int romanToInt(String a) {
        
        int sum = convertCharacter(a.charAt(a.length() - 1));
        int previousValue = sum; 
        
	    for (int i = a.length() -2; i >= 0; i--) {
	        
	        int currentValue = convertCharacter(a.charAt(i));

        	if (currentValue < previousValue) {
        		sum = sum - currentValue;
        	}
        	
        	else if (currentValue >= previousValue) {
        		sum = sum + currentValue;
        	}
	         
	        previousValue = currentValue;
	    }
	    
	    return sum;
	}
	    
	public static int convertCharacter(char a) {
	    switch (a) {
	        case 'I': return 1;
	        case 'V': return 5;
	        case 'X': return 10;    	            
	        case 'L': return 50;      
	        case 'C': return 100; 
	        case 'D': return 500;   
	        case 'M': return 1000; 
	        default:  return 0;
	    }
	}
	
    
    public static void main (String[] args) {
    	romanToInt("VII");
    }
}
