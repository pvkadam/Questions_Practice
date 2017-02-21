package binarySearchTree;
import java.util.*;

/*
 * You are given the following :

A positive number N
Heights : A list of heights of N persons standing in a queue
Infronts : A list of numbers corresponding to each person (P) that gives the number of persons who are taller than P and standing in front of P
You need to return list of actual order of persons’s height

Consider that heights will be unique

Example

Input : 
Heights: 5 3 2 6 1 4
InFronts: 0 1 2 0 3 2
Output : 
actual order is: 5 3 2 1 6 4 
 */

public class orderOfPeopleHeights {
	   public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
	        Person[] persons = new Person[heights.size()];
	        ArrayList<Integer> res = new ArrayList<Integer>();

	        for (int i = 0; i < persons.length; i++) {
	            persons[i] = new Person(heights.get(i), infronts.get(i));
	        }

	        //it's a lambda expression
	        Arrays.sort(persons, (p1, p2) ->  {
	            return Integer.compare(p2.height, p1.height);
	        });

	        for (int i = 0; i < persons.length; i++) {
	            //System.out.println("adding "+persons[i].height+" "+persons[i].count);
	            res.add(persons[i].count, persons[i].height);
	        }

	        return res;
	    }


	    private static class Person {
	        public final int height;
	        public final int count;

	        public Person(int h, int c) {
	            height = h;
	            count = c;
	        }
	    }
}
