import java.util.*;
public class containerWithMostWater {
	public int maxArea(ArrayList<Integer> a) {
	    
	    if (a.size() <= 1) {
	        return 0;
	    }
	    
	    ArrayList<Integer> areaValues = new ArrayList<Integer>();
	    
	    for (int i = 0; i < a.size() -1; i++) {
	        for (int j = i+1; j < a.size(); j++) {
	        	int width = Math.abs(i-j);
	        	int height = Math.min(a.get(i), a.get(j));
	        	
	            areaValues.add(width*height);
	            System.out.println("Area now adding is " + (Math.abs(a.get(i) - a.get(j)))*(Math.min(a.get(i), a.get(j))));
	        }
	    }
	    
	    Collections.sort(areaValues);
	    for (Integer i: areaValues) {
	    	//System.out.println(i);
	    }
	    
	    
	   //System.out.println(areaValues.get(areaValues.size() -1));
	    return areaValues.get(areaValues.size() - 1);
	     
	}
	
	public static void main (String[] args) {
		containerWithMostWater class1 = new containerWithMostWater();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		
		class1.maxArea(list);
	}
}
