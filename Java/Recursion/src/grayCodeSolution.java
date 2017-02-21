import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class grayCodeSolution {
	public ArrayList<Integer> grayCode(int a) {
		
		if (a == 0) {
			return null;
		}
		
		if (a == 1) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			list.add(1);
			return list;
		}
		
		//to recursively go to a smaller size
		ArrayList<Integer> grayCodeNumBitsMinus1 = grayCode(a - 1);
		
		//add 1 at bit index (a-1) to all entries in grayCodeNumBitsMinus1
		int leadingBitOne = 1 << (a -1);
		
		
		List<Integer> reflection = new ArrayList<Integer>();
		//process in reverse order to achieve reflection of grayCodeNumBitsMinus1
		for (int i = grayCodeNumBitsMinus1.size() -1; i >= 0; i--) {
			reflection.add(leadingBitOne | grayCodeNumBitsMinus1.get(i));
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>(grayCodeNumBitsMinus1);
		result.addAll(reflection);
		
		return result;
		
	}
}
