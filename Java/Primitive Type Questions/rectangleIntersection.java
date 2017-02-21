package primitiveTypes;

public class rectangleIntersection {
	int x, y, width, height;
	
	
	//check rectangle.java to see how rectangle is defined
	
	/*
	 * If R1 has bottom left points (1,1) with width 3 and height 3
	 * If R2 has bottom left points (3,3) with width 2 and 2
	 * There is intersection since: 1+3 = 4, R2.x is 3 which is less than 3
	 * Similarly check for R2 and also for height for both R1 and R2
	 */
	public static boolean intersection(rectangle R1, rectangle R2) {
		
		return R1.x <= R2.x + R2.width 
				&& R1.x + R1.width >= R2.x
				&& R1.y <= R2.y + R2.height
				&& R1.y + R1.height >= R2.height;
	}
	
	public static rectangle intersectionValue(rectangle R1, rectangle R2) {
		if (intersection(R1, R2)) {
			return new rectangle(Math.max(R1.x, R2.x), 
					Math.max(R1.y, R1.y), 
					Math.min(R1.x + R1.width, R2.x + R2.width) - Math.max(R1.x, R2.x), 
					Math.min(R1.y + R1.height, R2.y + R2.height) - Math.max(R1.y, R2.y));
		}
		
		return new rectangle(0,0,0,0);	//no intersection
	}
	
	
}
