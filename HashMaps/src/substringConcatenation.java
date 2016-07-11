import java.util.*;

/*
 * You are given a string, S, and a list of words, L, that are all of the same length.

Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.

Example :

S: "barfoothefoobarman"
L: ["foo", "bar"]
You should return the indices: [0,9].
(order does not matter).
 */

public class substringConcatenation {
	 public  ArrayList<Integer> findSubstring(String a, final List<String> b) {
		    HashMap<String, Integer> wordToFreq = new HashMap<String, Integer>();
		    for (String word : b) {
		      increment(word, wordToFreq);
		    }

		    int unitSize = b.get(0).length();
		    ArrayList<Integer> result = new ArrayList<Integer>();
		    for (int i = 0; i + unitSize * b.size() <= a.length(); ++i) {
		      if (matchAllWordsInDict(a, wordToFreq, i, b.size(), unitSize)) {
		        result.add(i);
		      }
		    }
		    return result;
		  }

		  private static boolean matchAllWordsInDict(String s, Map<String, Integer> wordToFreq, int start, int numWords, int unitSize) {
		    HashMap<String, Integer> currStringToFreq = new HashMap<String, Integer>();
		    for (int i = 0; i < numWords; ++i) {
		      String currWord
		          = s.substring(start + i * unitSize, start + (i + 1) * unitSize);
		      Integer freq = wordToFreq.get(currWord);
		      if (freq == null) {
		        return false;
		      }
		      increment(currWord, currStringToFreq);
		      if (currStringToFreq.get(currWord) > freq) {
		        // currWord occurs too many times for a match to be possible.
		        return false;
		      }
		    }
		    return true;
		  }

		  private static void increment(String word, Map<String, Integer> dict) {
		    Integer count = dict.get(word);
		    if (count == null) {
		      count = 0;
		    }
		    count++;
		    dict.put(word, count);
		  }
}
