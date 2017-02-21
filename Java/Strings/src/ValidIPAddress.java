import java.util.*;

public class ValidIPAddress {
	public ArrayList<String> restoreIpAddresses(String a) {
	    
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 1; i < 4 && i < a.length(); i++) {	//for 3 digits 
			String first = a.substring(0, i);
			
			if (isValidPart(first)) {
				for (int j = 1; j < 4 && i + j < a.length(); j++) {	//for 3 digits
					String second = a.substring(i, i+j);
					
					if (isValidPart(second)) {
						for (int k = 1; k < 4 && i + j + k < a.length(); k++) {	//for 3 digits
							String third = a.substring(i+j, i+j+k);
							String fourth = a.substring(i + j + k);
							
							if (isValidPart(third) && isValidPart(fourth)) {
								result.add(first + "." + second + "." + third + "." + fourth);
							}
						}
					}
				}
			}
				
		}
		
		return result;

	}
	
	
	//method to verify if the sub-part is valid or not with certain conditions
	public boolean isValidPart (String a) {
	    if (a.length() > 3) {
	        return false;
	    }
	    
	    else if (a.startsWith("0") && a.length() > 1) {
	    	return false;
	    }
	    
	    int value = Integer.parseInt(a);
	    
	    if (value >= 0 && value <= 255) {
	    	return true;
	    }
	    return false;
	}
}
