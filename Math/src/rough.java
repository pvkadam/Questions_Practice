import java.util.*;

public class rough {
	
	
	public String largestNumber(final List<Integer> a) {
		
		String result = "";
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for (int i = 0; i < a.size(); i++) {
			strings.add(a.get(i).toString());
		}
		
//		for (String s: strings) {
//			System.out.println(s);
//		}
		

		
		for (int i = 0; i < strings.size()-1; i++) {
			for (int j = i+1; j < strings.size(); j++) {
				if (strings.get(i).charAt(0) == strings.get(j).charAt(0) && strings.get(i).length() != strings.get(j).length()) {
//					int x = Integer.parseInt(strings.get(i));
//					int y = Integer.parseInt(strings.get(j));
					
					StringBuffer sb1 = new StringBuffer();
					sb1.append(strings.get(i));
					sb1.append(strings.get(j));
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append(strings.get(j));
					sb2.append(strings.get(i));
					
					
					
					
					
//					if (x < y ) {
//						strings.set(i, strings.get(i));
//						strings.set(j, strings.get(j));
//						
//					}
//					
//					else if (x > y) {
//						
//						String temp = strings.get(i);
//						strings.set(i, strings.get(j));
//						strings.set(j, temp);
//					}
					
				}
				
				else if (strings.get(i).compareTo(strings.get(j)) < 0) {
					
					String temp = strings.get(i);
					strings.set(i, strings.get(j));
					strings.set(j, temp);
				}
			}
			
		}
		
		for (String s: strings) {
			result += s;
		}
		
		System.out.println(result);
		
		
		return result;
		
	}
	
	
	public static void main (String[] args) {
		String name1 = "27";
		String name2 = "270";

		rough class1 = new rough();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(30);
		list.add(34);
		list.add(5);
		list.add(9);
		
		class1.largestNumber(list);
		
		int result = name1.compareTo(name2);
		
		//System.out.println(result);
	}
	
}
