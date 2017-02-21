import java.util.*;

/*
 * use a string builder because you want to avoid large and immutable strings and too many 
 * objects will be created which will result in a lot of garbage collection 
 * Hence use StringBuilder
 */


public class reverseStringWords {
	public String reverseWords(String a) {
		
        if (a == null || a.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = a.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		
		return sb.substring(0, sb.length() - 1);
	}
	
	public static void main (String[] args) {
		reverseStringWords class1 = new reverseStringWords();
		class1.reverseWords("This is a great place");
	}

}


