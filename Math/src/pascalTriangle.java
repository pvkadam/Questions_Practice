import java.util.*;

public class pascalTriangle {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	   
	   ArrayList<ArrayList<Integer>>  pascalTriangle = new ArrayList<ArrayList<Integer>>();
	   
	   
	   if (a == 0) {
	       return pascalTriangle;
	   }
	   
	   else if (a == 1) {
		   ArrayList<Integer> newRow = new ArrayList<Integer>();
	       newRow.add(1);
	       pascalTriangle.add(newRow);
	   }
	   
	   else if (a == 2) {
		   for (int i = 0; i < a; i++) {
			   ArrayList<Integer> newRow = new ArrayList<Integer>();
			   for (int j = 0; j <=i; j++) {
				   newRow.add(1);
			   }
			   pascalTriangle.add(newRow);   
		   }
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
		   
		   for (int i = 2; i < a; i++) {
			   ArrayList<Integer> newRow = new ArrayList<Integer>();
			   newRow.add(1);
			   for (int j = 0; j < i - 1; j++) {
				   newRow.add(pascalTriangle.get(i-1).get(j) + pascalTriangle.get(i-1).get(j+1));
			   }
			   newRow.add(1);
			   pascalTriangle.add(newRow);
		   } 
	   }
	   
	   for (int i = 0; i < pascalTriangle.size(); i++) {
		   for (int j = 0; j < pascalTriangle.get(i).size(); j++) {
			   System.out.print(pascalTriangle.get(i).get(j) + " ");
		   }
		   
		   System.out.println();
	   }
	   
	   return pascalTriangle;
	   
	}
	
	
	public static void main (String[] args) {
		pascalTriangle newClass = new pascalTriangle();
		newClass.generate(0);
	}
}
