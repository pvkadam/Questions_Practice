
public class decodingWays {
	public static int numDecodings(String a) {
		if (a.length() == 0 || a.equals("0")) {
			return 0;
		}
		
		int[] array = new int[a.length() + 1];
		
		array[0] = 1;
		
		//check for the first character
		if (isValid(a.substring(0, 1))) {
			array[1] = 1;
		}
		
		else {
			array[1] = 0;
		}
		
		for (int i = 2; i <= a.length(); i++) {
			if (isValid(a.substring(i-1, i))) {
				array[i] += array[i-1];
			}
			
			if (isValid(a.substring(i-2, i))) {
				array[i] += array[i-2];
			}
		}
		System.out.println(array[a.length()]);
		return array[a.length()];
		
	}
	
	public static boolean isValid(String s) {
		if (s.charAt(0) == '0') {
			return false;
		}
		
		int value = Integer.parseInt(s);
		
		if (value >= 1 && value <= 26) {
			return true;
		}
		
		return false;
		
	}
	
	public static void main (String[] args) {
		numDecodings("123");
	}
	
	
}
