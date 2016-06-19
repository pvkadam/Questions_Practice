package primitiveTypes;

public class divideWithoutDivideOperator {
	
	//dividend = divisor*quotient + reminder
	//want quotient
	
	public static int divide (int x, int y) {
		
		int quotient = 0;
		int reminder = 0;
		
		if (y == 0) {
			System.out.println("Cannot divide by 0");
		}
		
		else {
			while ((x-y) >= 0) {
				quotient++;
				x -=y;
			}
		}
		
		reminder = x;
		
		System.out.println("Quotient is " + quotient);
		System.out.println("Reminder is " + reminder);
		return quotient;
	}
		
	
	public static void main (String[] args) {
		divide (10,3);
	}
}
