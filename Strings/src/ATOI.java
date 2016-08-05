public class ATOI {
	public static int atoi(final String a) {
	    
	    if (a.length() == 0) {
	        return 0;
	    }
	    
	    String temp = a.trim();
	    
	    char flag = '+';
	    int i = 0;
	    
	    if (temp.charAt(0) == '-') {
	        flag = '-';
	        i++;
	    }
	    
	    else if (temp.charAt(0) == '+') {
	        flag = '+';
	        i++;
	    }	  
	    
	    else if (temp.charAt(0) == ' ') {
	        i++;
	    }
	    
	    double result = 0;
	    
	    while (temp.length() > i && temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
	        result = result*10 + (temp.charAt(i) - '0');
	        i++;
	    }
	    
	    if (flag == '-') {
	        result = -result;
	    }
	    
	    if (result > Integer.MAX_VALUE) {
	        result = Integer.MAX_VALUE;
	    }
	    
	    else if (result < Integer.MIN_VALUE) {
	        result = Integer.MIN_VALUE;
	    }
	    
	    return (int) result;
	    
	}
	
	public static void main (String[] args) {
		System.out.println(atoi("945"));
	}
}
