import java.util.*;

/*
 * Given a string s and a dictionary of words dict, determine if s can be 
 * segmented into a space-separated sequence of one or more dictionary words.

For example, given

s = "myinterviewtrainer",
dict = ["trainer", "my", "interview"].
Return 1 ( corresponding to true ) because "myinterviewtrainer" can be segmented 
as "my interview trainer".
 */
public class wordBreak {
	   public ArrayList<String> wordBreak(String s, ArrayList<String> dict) {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
	        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	        return wordBreakHelper(s,dict,map);
	    }

	    public ArrayList<String> wordBreakHelper(String s, ArrayList<String> dict, Map<String, ArrayList<String>> memo){
	        if(memo.containsKey(s)) return memo.get(s);
	        ArrayList<String> result = new ArrayList<String>();
	        int n = s.length();
	        if(n <= 0) return result;
	        for(int len = 1; len <= n; ++len){
	            String subfix = s.substring(0,len);
	            if(dict.contains(subfix)){
	                if(len == n){
	                    result.add(subfix);
	                }else{
	                    String prefix = s.substring(len);
	                    ArrayList<String> tmp = wordBreakHelper(prefix, dict, memo);
	                    for(String item:tmp){
	                        item = subfix + " " + item;
	                        result.add(item);
	                    }
	                }
	            }
	        }
	        memo.put(s, result);
	        return result;
	    }
}
