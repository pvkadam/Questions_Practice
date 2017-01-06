
public class casioCalculator extends calculator {
	
	public void startingMessage() {
		System.out.println("Welcome to Casio");
	}
	
	public int addNumbers() {
		int x = 10;
		int y = 20;
		
		return add(x, y);
		
	}
	
	
	public static void main (String[] args) {
		casioCalculator casioCalculator = new casioCalculator();
		casioCalculator.startingMessage();
		casioCalculator.calculate();
	}
	
}
