
public class palindromeString {
	public int isPalindrome(String a) {
	    
	    a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	   
	    for(int i = 0; i < a.length() ; i++){
			if(a.charAt(i) != a.charAt(a.length() - 1 - i)){
				return 0;
			}
		}
	    
	    return 1;
	}
}
