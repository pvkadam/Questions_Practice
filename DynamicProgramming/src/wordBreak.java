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
    public static boolean wordbreak(String s, ArrayList<String> dictionary){
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true;
        
        for(int i = 0; i < s.length(); i++){
            if(!t[i])
                continue;
            for(String word : dictionary){
                int length = word.length();
                int end = i + length;
                if(end > s.length())
                    continue;
                if(t[end])
                    continue;
                if(s.substring(i, end).equals(word))
                    t[end] = true;
            }
        }
        return t[s.length()];
    }
}
