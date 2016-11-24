
/*
 * https://www.youtube.com/watch?v=We3YDTzNXEk
 */

//Find the minimum number of edits needed to transform the first string into the second string

public class levenshteinAlgorithm {
	public static int minDistance(String a, String b) {
		
		int DP[][] = new int[a.length() + 1][b.length() + 1];
		
		for (int i = 0; i <= a.length(); i++) {
			DP[i][0] = i;
		}
		
		for (int j = 0; j <= b.length(); j++) {
			DP[0][j] = j;
		}
		
		for (int i = 0; i < a.length(); i++) {
			char c1 = a.charAt(i);
			
			for (int j = 0; j < b.length(); j++) {
				char c2 = b.charAt(j);
				
				if (c1 == c2) {
					//same as the previous diagonal
					DP[i + 1][j + 1] = DP[i][j];
				}
				
				else {
					int replace = DP[i][j] + 1; //adding diagonally
					int delete = DP[i][j + 1] + 1;	//moving along left
					int insert = DP[i+1][j] + 1;	//moving above
					
					int min = replace > delete ? delete : replace;
					min = min > insert ? insert : min;
					
					DP[i + 1][j + 1] = min;
					
				}	
			}
		}
		
		for (int i = 0; i < DP.length; i++) {
			for (int j = 0; j < DP[0].length; j++) {
				System.out.print(DP[i][j] + " ");
			}
			System.out.println("");
		}
		
		return DP[a.length()][b.length()];
		
	}
	
	public static void main (String[] args) {
		minDistance("abcdef", "azced");
	}
	
}
