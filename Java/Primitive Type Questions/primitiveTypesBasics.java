package primitiveTypes;

public class primitiveTypesBasics {
	
	public static void BitwiseBasics() {
		
		int x;		//in Java, int is always 32 bits
		
		//---------------------------------------------------------------------------------------------
		
		//Using & as bitwise AND operator
		
		x = 4&7;
		
		/*	
		 *	in a 32 bit system, 4 is 00000000 00000000 00000000 00000100
		 *	in a 32 bit system, 7 is 00000000 00000000 00000000 00000111
		 *	in a 32 bit system, x is 00000000 00000000 00000000 00000100
		 */
		
		System.out.println(x);	//would print 4
		
		//---------------------------------------------------------------------------------------------
		
		//Using | as bitwise OR operator
		
		x = 4|7;
		
		/*	
		 *	in a 32 bit system, 4 is 00000000 00000000 00000000 00000100
		 *	in a 32 bit system, 7 is 00000000 00000000 00000000 00000111
		 *	in a 32 bit system, y is 00000000 00000000 00000000 00000111
		 */
		
		System.out.println(x);	//would print 7
		
		//---------------------------------------------------------------------------------------------

		//Using >> as bitwise signed right shift operator
		
		x = 8>>1;
		
		/*
		 * in a 32 bit system, 8 is 00000000 00000000 00000000 00001000
		 * Shifting right by 1 would result in 00000000 00000000 00000000 00000100
		 */
		
		System.out.println(x);	//would print 4
		
		x = -4>>1;
		System.out.println(x);	//would print -2
		
		x = -4>>2;
		System.out.println(x);	//would print -1
		
		x = -4>>3;
		System.out.println(x);	//would still print -1
		
		//---------------------------------------------------------------------------------------------

		//Using << as bitwise signed left shift operator
		
		x = 1<<3;
		
		/*
		 * in a 32 bit system, 1 is 00000000 00000000 00000000 00000001
		 * Shifting left by 10 would result in 00000000 00000000 00000000 00001000
		 */
		
		System.out.println(x);	//would print 8
		
		//---------------------------------------------------------------------------------------------
		
		//Using >>> as bitwise unsigned zero fill right shift operator
		
		x = 4>>>2;
		System.out.println(x);		//would print 1
		
		x = -4>>>2;
		System.out.println(x);		//would print 1073741823
		
		x = 4>>>-2;				// --> -2 is 30 
		System.out.println(x);		//would print 3
		
		//---------------------------------------------------------------------------------------------

		//Using ~ bitwise complement operator, i.e., convert to bits, add 1 and then negate
		
		x = ~7;
		System.out.println("ef");
		System.out.println(x);		// 111 + 1 = 1000 --> negate 1000
		
		//---------------------------------------------------------------------------------------------

		//Using ^ as bitwise XOR operator --> both 1 & 1 and 0 & 0 are 0, rest is 1
		
		x = 10 ^ 12;
		
		/*
		 * 10 is 1010
		 * 12 is 1100
		 * x is 0110
		 */
		
		System.out.println(x);	//would print 6
	}
	
	/*
	 * In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.
	 * For example: -2 represented in 8 bits would be 11111110 (because the most significant bit has negative weight). 
	 * Shifting it right one bit using arithmetic shift would give you 11111111, or -1. 
	 * Logical right shift, however, does not care that the value could possibly represent a number; it simply moves everything to the right and fills in from the left with 0s. 
	 * Shifting our -2 right one bit using logical shift would give 01111111.
	 */
	
	
	public static short countOneBits(int x) {

		/*
		 * Method to calculate 1's in an integer
		 * Will check AND with 1 at the LSB
		 * Shift LSB by 1 to the right
		 * Time complexity --> O(n)
		 */		
		
		short numberOfBits = 0;
		
		while (x != 0) {
			numberOfBits += (x & 1);
			System.out.println("value of x after & is " + x);
			System.out.println("number of Bits is " + numberOfBits);
			x >>>= 1;
			System.out.println("value of x after shifting is " + x);
			System.out.println("----");
		}
		
		System.out.println("total no. of ones is " + numberOfBits);
		return numberOfBits;
	}
	
	
	public static void main (String[] args) {
		BitwiseBasics();
		countOneBits(7);
	}
}
