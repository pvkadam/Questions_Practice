import java.util.*;

public class candies {
	   public int candy(ArrayList<Integer> ratings) {
	        if(ratings == null || ratings.size() == 0)
	            return 0;
	        
	        int[] candies = new int[ratings.size()];        
	        candies[0] =  1;
	        //from left to right
	        for(int i = 1; i < ratings.size(); i++){
	            if(ratings.get(i) > ratings.get(i - 1))
	                candies[i] = candies[i-1] + 1;
	            else{                
	                candies[i] = 1;
	            }
	        }
	        //from right to left
	        int result = candies[ratings.size() - 1];
	         for(int i = ratings.size()-2; i >= 0; i--){
	             int cur = 1;
	             if(ratings.get(i) > ratings.get(i + 1))
	                 cur = candies[i+1] + 1;
	             result += Math.max(cur, candies[i]);
	             candies[i] = cur;
	         }
	         
	        return result;
	    }
}
