package primitiveTypes;
import java.util.*;

public class generateRandomNumbers {
	
	public static void randomNumbers(int a, int b) {
		Random number = new Random();
		int result;
		
		result = number.nextInt(a - b) + b;
		
		System.out.println(result);
		
	}
	
	public static void main (String[] args) {
		randomNumbers(7,3);
	}
		
}
