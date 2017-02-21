import java.util.*;

/*
 * This problem can be viewed as finding all ascending sequences. 
 * For example, given {5, 1, 2, 3, 4}, buy at 1 & sell at 4 is the same as 
 * buy at 1 &sell at 2 & buy at 2& sell at 3 & buy at 3 & sell at 4.

We can scan the array once, and find all pairs of elements that are in ascending order.
 */
public class buyAndSellStockNTimes {
    public int maxProfit(final List<Integer> a) {
    	int profit = 0;
    	
    	for (int i = 1; i < a.size(); i++) {
    		int difference = a.get(i) - a.get(i - 1);
    		
    		if (difference > 0) {
    			profit += difference;
    		}
    		
    	}
    	
    	return profit;
    }
}
