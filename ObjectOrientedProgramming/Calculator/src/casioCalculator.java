
public class casioCalculator extends calculator {
	
	public void startingMessage() {
		System.out.println("Welcome to Casio");
	}
	
	public static void main (String[] args) {
		casioCalculator casioCalculator = new casioCalculator();
		casioCalculator.startingMessage();
		casioCalculator.calculate();
	}
	
}
