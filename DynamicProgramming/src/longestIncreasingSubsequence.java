import java.util.*;

public class longestIncreasingSubsequence {
	public int lis(final List<Integer> a) {
		   if(a==null || a.size()==0)
	        return 0;
	 
	    int[] max = new int[a.size()];
	 
	    for(int i=0; i<a.size(); i++){
	        max[i]=1;
	        for(int j=0; j<i;j++){
	            if(a.get(i)>a.get(j)){
	                max[i]=Math.max(max[i], max[j]+1);
	            }
	        }
	    }
	 
	    int result = 0;
	    for(int i=0; i<max.length; i++){
	        if(max[i]>result)
	            result = max[i];
	    }
	    return result;
		}
}
