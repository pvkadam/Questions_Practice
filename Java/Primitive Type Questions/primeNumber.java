package primitiveTypes;

public class primeNumber {
	public static boolean isPrimeNumber(int x) {
		int number = (int) Math.sqrt(x);
		
		if (x == 1) {
			System.out.println(x + " is not a prime");
			return false;
		}
		
		for (int i = 2; i <= number; i++) {
			if (x%i == 0) {
				System.out.println(x + " is not a prime");
				return false;				
			}
		}
		
		System.out.println(x + " is a prime");
		return true;
		
	}
	
	public static void main(String[] args) {
		isPrimeNumber(107);
	}
	
}
