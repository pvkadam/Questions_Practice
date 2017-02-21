import java.util.*;
/*
 * Given an array of integers, return the highest product possible by multiplying 
 * 3 numbers from the array

Input:

array of integers e.g {1, 2, 3}
 NOTE: Solution will fit in a 32-bit signed integer 
Example:

[0, -1, 3, 100, 70, 50]

=> 70*50*100 = 350000
 */
public class highestProduct {
	public static int maxp3(ArrayList<Integer> a) {
        Collections.sort(a);
        int n = a.size();
        System.out.println(a);
        return Math.max((a.get(n-1) * a.get(n-2) * a.get(n-3)),
                        (a.get(n-1) * a.get(0) * a.get(1)));
    }
}
