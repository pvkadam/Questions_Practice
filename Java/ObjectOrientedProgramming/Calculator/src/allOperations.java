
//if not abstract class, MUST implement all the methods. In this case, since it's an abstract class, it's not really necessary. 
public abstract class allOperations implements simpleOperations, otherOperations {
	
	abstract public int compare (int x, int y);
	
	@Override
	public int absoluteValue(int x) {
		return Math.abs(x);
	}

	@Override
	public int remainder(int x, int y) {
		return x % y;
	}

	@Override
	public int power(int x, int y) {
		return (int) Math.pow(x, y);
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int subtract(int x, int y) {
		return x - y;
	}

	@Override
	public int multiply(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		return x / y;
	}
	
}
