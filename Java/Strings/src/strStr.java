/*
 * haystack a needle d
i 0
j 0
---------
haystack b needle d
i 1
j 0
---------
haystack c needle d
i 2
j 0
---------
haystack d needle d
 equal case: i 3
 equal case: j 1
---------
haystack e needle e
 equal i 4
 equal j 2
---------
i 5
M 2
3

 */
public class strStr {
    public static int strStr(final String haystack, final String needle) {
        if(haystack.isEmpty() || needle.isEmpty())
            return -1;
        if(haystack == null || needle == null)
            return -1;
        int i, j;
        int M = needle.length();
        int N = haystack.length();
        
        for(i = 0, j = 0; i < N && j < M; i++){
            if(haystack.charAt(i) == needle.charAt(j)) 
                j++;
            else{
                i = i - j;
                j = 0;
            }
        }
        
        
        if(j == M)
            return i - M;
        else
            return -1;
    }
    
    public static void main (String[] args) {
    	System.out.println(strStr("abcdef", "de"));
    
    	
    }
}
