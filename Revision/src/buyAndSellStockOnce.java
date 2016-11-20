import java.util.*;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Java Solution

Instead of keeping track of largest element in the array, we track the maximum profit so far.
 */

public class buyAndSellStockOnce {
	
	/*
	 * 1. Set minimum to the 1st element and keep looping through all elements
	 * 		1. 
	 * 		2. Update the minimum element through all the loops to get the maximum profit
	 */
	
	public int maxProfit(final List<Integer> a) {
		
		if (a.size() <= 1) {
			return 0;
		}
		
		int minimum = a.get(0);
		int maxProfit = 0;
		
		for (int i = 1; i < a.size(); i++) {
			maxProfit = Math.max(maxProfit, a.get(i) - minimum);	//keep track of the max profit
			minimum = Math.min(minimum, a.get(i));	//keep track of the minimum element
		}
		
		return maxProfit;
		
	}

}
