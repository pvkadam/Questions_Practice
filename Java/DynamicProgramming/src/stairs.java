
public class stairs {
	public int climbStairs(int a) {
		
		if (a <= 3) {
			return a;
		}
		
		int f1 = 1;
		int f2 = 2;
		
		for (int i = 3; i <=a; i++) {
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		System.out.println(f2);
		return f2;
	}
	
	//or
	public int climbStairsRecursion(int a) {
		
		if (a <= 2) {
		    return a;
		}
		
		return climbStairsRecursion(a - 1) + climbStairsRecursion(a-2);
	}
}
