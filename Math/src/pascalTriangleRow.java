import java.util.*;


public class pascalTriangleRow {
	public ArrayList<Integer> getRow(int a) {
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		 ArrayList<ArrayList<Integer>>  pascalTriangle = new ArrayList<ArrayList<Integer>>();
		   
		   
		   if (a < 0) {
			   System.out.println(row);
		       return row;
		   }
		   
		   else if (a == 0) {
			   ArrayList<Integer> newRow = new ArrayList<Integer>();
		       newRow.add(1);
		       System.out.println(newRow);
		       return newRow;
		   }
		   
		   else if (a == 1) {
			   for (int i = 0; i <= a; i++) {
				   ArrayList<Integer> newRow = new ArrayList<Integer>();
				   for (int j = 0; j <=i; j++) {
					   newRow.add(1);
				   }
				   pascalTriangle.add(newRow); 
			   }
			   
			   System.out.println(pascalTriangle.get(a));
			   return pascalTriangle.get(a);
		   }
		   
		   else {
			   //till row 2
			   for (int i = 0; i < 2; i++) {
				   ArrayList<Integer> newRow = new ArrayList<Integer>();
				   for (int j = 0; j <=i; j++) {
					   newRow.add(1);
				   }
				   pascalTriangle.add(newRow);   
			   }
			   
			   for (int i = 2; i <= a; i++) {
				   ArrayList<Integer> newRow = new ArrayList<Integer>();
				   newRow.add(1);
				   for (int j = 0; j < i - 1; j++) {
					   newRow.add(pascalTriangle.get(i-1).get(j) + pascalTriangle.get(i-1).get(j+1));
				   }
				   newRow.add(1);
				   pascalTriangle.add(newRow);
			   } 
			   
			   System.out.println(pascalTriangle.get(a));
			   return pascalTriangle.get(a);
		   }
		
	}
	
	public static void main(String[] args) {
		pascalTriangleRow newClass = new pascalTriangleRow();
		newClass.getRow(4);
	}
}
