import java.util.*;

/*
 * The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

For "bbbbb" the longest substring is "b", with the length of 1.
input= "dadbc"
expected output= "4"
 */

public class lengthOfLongestSubstringDistinct {
    public int lengthOfLongestSubstring(String a) {
        if(a == null)
            return 0;
        
        int length = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < a.length(); i++){
            if(!map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), i);
            }
            else{
            	length = Math.max(length, map.size());
                i = map.get(a.charAt(i));	//sets i back to index 0 in example so that i will start from 1
                map.clear();
            }
        }
        return Math.max(length, map.size());
    }
}
