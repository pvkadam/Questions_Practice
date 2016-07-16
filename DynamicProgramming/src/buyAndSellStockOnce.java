import java.util.*;

public class buyAndSellStockOnce {
    public int maxProfit(final List<Integer> a) {
    	if (a.size() <= 1) {
    		return 0;
    	}
    	
    	int minimum = a.get(0);
    	int result = 0;
    	
    	for (int i = 1; i < a.size(); i++) {
    		result = Math.max(result, a.get(i) - minimum);
    		minimum = Math.min(minimum, a.get(i));
    	}
    	
    	return result;
    	
    }
}
