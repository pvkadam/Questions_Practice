import java.util.*;

public class maxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    
	    int sum = 0;
	    
	    ArrayList<ArrayList<Integer>> resultArray = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    
	    //for adding elements into resultArray 
	    //row of the form [num num num... num SUM index]
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i) >= 0) {
	            row.add(a.get(i));
	        }
	        
	        else if (a.get(i) < 0) {
	            
	            for (int j = 0; j < row.size(); j++) {
	                sum += row.get(j);
	            }
	            
	            row.add(sum);
	            resultArray.add(row);
	            for (int j = 0; j < row.size(); j++) {
	            	System.out.print(j + " ");
	            }
	            
	            row.clear();
	        }
	        
	        System.out.println("------------");
	    }
	    
//	    for (int i = 0; i < resultArray.size(); i++) {
//	    	for (int j = 0; j < resultArray.get(i).size() - 1; j++) {
//	    		System.out.print(resultArray.get(i).get(j));
//	    		System.out.println(" ");
//	    		
//	    	}
//	    	
//	    	System.out.println("---------------");
//	    }

	    int maxSumIndex = 0;
	    int maxSum = resultArray.get(0).get(resultArray.get(0).size() - 1); //sum stored at last
	    ArrayList<Integer> finalRow = new ArrayList<Integer>();
	    
	    for (int i = 0; i < resultArray.size() - 1; i++) {
	        if (maxSum > resultArray.get(i+1).get(resultArray.get(i+1).size() -1)) {
	            maxSumIndex = i;
	        }
	        
	        else if (maxSum == resultArray.get(i+1).get(resultArray.get(i+1).size() -1)) {
	            
	           for (int j = 0; j < resultArray.get(i).size() -2; j++) {
	               finalRow.add(j);
	           } 
	            
	           // for (Integer k: resultArray.get(i).size() -2) {
	           //     finalRow.add(k);
	           // }
	            return finalRow;
	        }
	        
	        else {
	            maxSum = resultArray.get(i+1).get(resultArray.get(i+1).size() -1);
	            maxSumIndex = i+1;
	            
	        }
	    }
	    
	   for (int j = 0; j < resultArray.get(maxSumIndex).size() -2; j++) {
	       finalRow.add(j);
	   } 
	    
	   // for (Integer k: resultArray.get(maxSumIndex).size() -2 ) {
	   //     finalRow.add(k);
	   // }
	    
	    return finalRow;
	      
	}
	
	public static void main (String[] args) {
		maxNonNegativeSubArray newClass = new maxNonNegativeSubArray();
	   
		//ArrayList<ArrayList<Integer>> resultArray = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    
	    row.add(1);
	    row.add(2);
	    row.add(3);
	    row.add(-1);
	    row.add(5);
		row.add(3);
		row.add(-5);
	    row.add(5);
		row.add(7);
		
		
		newClass.maxset(row);
		
	}
}
