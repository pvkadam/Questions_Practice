/*
 * A robot is located at the top-left corner of an A x B grid (marked ÔStartÕ in the diagram below).



The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ÔFinishÕ in the diagram below).

How many possible unique paths are there?

Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.

Example :

Input : A = 2, B = 2
Output : 2

2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)
 */
public class gridUniquePaths {
	public static int uniquePaths(int a, int b) {
	     
	    int[][] array = new int[a][b];
	    
	    for (int i = 0; i < a; i++) {
	        array[i][0] = 1;
	    }
	    
	    for (int i = 0; i < b; i++) {
	        array[0][i] = 1;
	    }
	    
	    for (int i = 1; i < a; i++) {
	        for (int j = 1; j < b; j++) {
	            array[i][j] = array[i-1][j] + array[i][j-1];
	        }
	    }
	    System.out.println(array[a-1][b-1]);
	    return array[a-1][b-1];
	}
	
	public static void main (String[] args) {
		uniquePaths(4,5);
	}
}
