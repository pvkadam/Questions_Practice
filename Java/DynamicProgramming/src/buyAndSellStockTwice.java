import java.util.*;
/*
 * https://www.youtube.com/watch?v=oDhu5uGq_ic&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr&index=31
 */
public class buyAndSellStockTwice {

    public int maxProfit(final List<Integer> a) {
    	return maxProfitGeneral(a, 2);
    }
	
	
	//for k times
	public int maxProfitGeneral (final List<Integer> prices, int K) {
		if (prices.size() == 0) {
			return 0;
		}
		
		int transactions[][] = new int[K+1][prices.size()];
		
		for (int i = 1; i < transactions.length; i++) {
			int maxDifference = -prices.get(0);
			
			for (int j = 1; j < transactions[0].length; j++) {
				transactions[i][j] = Math.max(transactions[i][j-1], prices.get(j) + maxDifference);
				maxDifference = Math.max(maxDifference, transactions[i-1][j] - prices.get(j));
			}
			
		}
		System.out.println(transactions[K][prices.size() -1]);
		return transactions[K][prices.size() -1];
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> prices = new ArrayList<Integer>();
		
		int prices1[] = {1, 2};
		
		for (int i = 0; i < prices1.length; i++) {
			prices.add(prices1[i]);
		}
		
		buyAndSellStockTwice buyAndSellStockTwice = new buyAndSellStockTwice();
		buyAndSellStockTwice.maxProfitGeneral(prices, 2);
		
	}
	
}
