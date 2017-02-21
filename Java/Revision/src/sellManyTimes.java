import java.util.*;

public class sellManyTimes {
	
	public int sell(final List<Integer> a) {
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
