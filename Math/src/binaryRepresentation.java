
public class binaryRepresentation {
	public static String findDigitsInBinary(int A) {
		    
		    String binary = "";
		    
		    if (A == 0)
		        return "0";
		    
		    while (A != 0) {
		        int dig = A % 2;
		        binary = (dig == 1 ? "1" : "0") + binary;
		        A /= 2;
		    }
		    
		    System.out.println(binary);
		    return binary;
		    
		}

	public static void main (String[] args) {
		findDigitsInBinary(6);
	}
}
