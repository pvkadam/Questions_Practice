/*
 * Methods to rotate clockwise and anti-clockwise by 90 degrees
 */
import java.util.*;

public class rotateMatrix {
	 
	public static void transpose(ArrayList<ArrayList<Integer>> A) {
		
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.get(0).size(); j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
	}
	
	
	
	public static void swapRows(ArrayList<ArrayList<Integer>> A) {
		
		for (int i = 0, k = A.size() - 1; i < k; i++, k--) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.addAll(A.get(i));
			A.set(i, A.get(k));
			A.set(k, temp);
		}
		
	}
	
	public static ArrayList<ArrayList<Integer>> rotateClockWise90(ArrayList<ArrayList<Integer>> A) {
		swapRows(A);
		transpose(A);

		return A;
	}
	
	public static ArrayList<ArrayList<Integer>> rotateAntiClockWise90(ArrayList<ArrayList<Integer>> A) {
		transpose(A);
		swapRows(A);
		return A;
	}
	
	public static void main (String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		
		row1.add(1);
		row1.add(2);
		row1.add(3);
		A.add(row1);
		row2.add(4);
		row2.add(5);
		row2.add(6);
		A.add(row2);
		row3.add(7);
		row3.add(8);
		row3.add(9);
		A.add(row3);

		rotateClockWise90(A);
		
		
	}
	
	
	 
}
