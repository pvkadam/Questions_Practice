
public class zigzagString {
	
	//First define number of jumps in the form of steps
	//Compute for the first and last rows first
	//Then compute for other middle rows
		//for middle rows, use two steps and keep alternating between them
	
	public String convert(String a, int b) {
		
		if (b == 1) {
			return a;
		}
		
		StringBuilder sb = new StringBuilder();
		
		int step = 2 * b - 2; //no. of jumps to reach characters in a String
		
		for (int i = 0; i < b; i++) {	//for the rows
			
			//first do for the first row and the last row
			if (i == 0 || i == b - 1) {
				for (int j = i; j < a.length(); j = j + step) {
					sb.append(a.charAt(j));
				}
			}
			
			// for middle rows
			else {
				int j = i;
				boolean flag = true;	//used to switch rows
				int step1 = 2 * (b - 1 - i);
				int step2 = step - step1;
				
				while (j < a.length()) {
					sb.append(a.charAt(j));
					if (flag) {
						j = j + step1;	//for jumps 
					}
					
					else {
						j = j + step2;	//for jumps
					}
					
					flag = !flag;	//to switch between steps
			
				}
				
			}
		}
		
		return sb.toString();
	}
}
