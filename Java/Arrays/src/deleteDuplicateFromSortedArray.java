import java.util.*;

public class deleteDuplicateFromSortedArray {
	public static ArrayList<Integer> deleteDuplicates(ArrayList<Integer> list) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (list.size() == 0) {
			return result;
		}
		
		result.add(list.get(0));
		int validElements = 1;
		
		//don't change the first element's position
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) != list.get(i - 1)) {
				result.add(list.get(i));
				validElements++;
			}
		}
		
		for (int i: result)
			System.out.println(i);
		
		System.out.println("valid elements" + validElements);
		return result;
		
	}
	
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(11);
		list.add(13);
		
		deleteDuplicates(list);
		
	}
}
