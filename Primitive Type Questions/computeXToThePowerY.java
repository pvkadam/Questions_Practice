package primitiveTypes;

public class computeXToThePowerY {

	public static int power (int x, int y) {
		
		int result = 1;
	
		if (y == 0) {		
			result = 1;
		}
		
		else {
			for (int i = 0; i < y; i++) {
				result *=x;
			}			
		}
		
		System.out.println("Result is " + result);
		return result;

	}
	
	public static void main (String[] args) {
		power(2,10);
	}
}
