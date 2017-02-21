package primitiveTypes;

public class multiplicationAndAddtionWithoutArithmeticOperators {

	public static int add (int a, int b) {
		while (b != 0) {
			int carry = (a & b);
			System.out.println("carry is " + carry);
			a ^=b;
			System.out.println("A ^=b is " + a);
			b = carry << 1;
			System.out.println("New b is " + b);
			System.out.println("---------------------");
		}
		System.out.println(a);
		return a;
	}
	
	public static int multiply(int a, int b) {
		int sum = 0;
		
		while (a != 0) {
			
			if ((a & 1) != 0) {
				sum = add(sum,b);
			}
			
			a >>>= 1;
			b <<= 1;
		}
		
		System.out.println(sum);
		return sum;
	}
	
	
	public static void main (String[] args) {
		add(4,5);	//4 is 100, 5 is 101. 9 is 1001
		multiply(4,5);
	}
}
