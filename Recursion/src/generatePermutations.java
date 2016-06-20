import java.util.*;

/*
 * for input [1,2,3]
 * expected output is: [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]
 */

public class generatePermutations {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		directedPermutations (0, a, result);
		return result;
		
	}
	
	public void directedPermutations(int i, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> result) {
		
		//the base case
		//if the length of the final permutation is only 1, then simply return it 
		if (i == a.size() - 1) {
			result.add(new ArrayList<Integer>(a));
			System.out.println(a);
			return;
		}
		
		//recursion part
		
		for (int j = i; j < a.size(); j++) {
			Collections.swap(a, i, j);

			//compute all permutations for sublist (i+1, a.size())
			directedPermutations(i+1, a, result);
			//once all the permutations are over, the final one will be [3, 2, 1]
			//to bring it back to [1. 2, 3] swap again
			Collections.swap(a, i, j);
		}
	}
	
	public static void main (String[] args) {
		generatePermutations class1 = new generatePermutations();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		class1.permute(a);
	}
	
}
