import java.util.*;
/*
 * Given a 2 * N Grid of numbers, choose numbers such that the sum of the numbers
is maximum and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.

Example:

Grid:
	1 2 3 4
	2 3 4 5
so we will choose
3 and 5 so sum will be 3 + 5 = 8


Note that you can choose more than 2 numbers
 */
public class maxSumWithoutAdjacentElements {
	public int adjacent(ArrayList<ArrayList<Integer>> a) {
	     if(a == null || a.size() == 0)
           return 0;
       
       int n = a.get(0).size();
       if(n == 0)
           return 0;
       
       int[] dp = new int[n];
       ArrayList<Integer> first = a.get(0);
       ArrayList<Integer> second = a.get(1);
       
       dp[0] = Math.max(first.get(0), second.get(0));
       
       if(n < 2)
           return dp[0];
       
       dp[1] = Math.max(first.get(1), second.get(1));
       dp[1] = Math.max(dp[0], dp[1]);
       
       for(int i = 2; i < n; i++){
           dp[i] = Math.max(first.get(i), second.get(i));
           dp[i] += dp[i-2];
           dp[i] = Math.max(dp[i], dp[i-1]);
       }
       
       
       return dp[n-1];
	}
}
