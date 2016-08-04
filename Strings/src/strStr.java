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
        	System.out.println("haystack " + haystack.charAt(i) + " needle " + needle.charAt(j));

            if(haystack.charAt(i) == needle.charAt(j)) {

                j++;
                System.out.println(" equal i " + i);
            	System.out.println(" equal j " + j);
            }
            else {
                i = i - j;
                j = 0;
                
                System.out.println("i " + i);
                System.out.println("j " + j);
            }
            
            System.out.println("---------");
        }
        
        System.out.println("i " + i);
        System.out.println("M " + M);
        if(j == M)
            return i - M;
        else
            return -1;
    }
    
    public static void main (String[] args) {
    	System.out.println(strStr("abcdef", "de"));
    
    	
    }
}
