import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;


/*
 * The assertEquals() method is a statically imported method, which normally resides in the org.junit.Assert class. 
 * Notice the static import of this class
 * Using the static import of the method is shorter than writing Assert.assertEquals().
 */

public class test {

	@Test
	public void testAdd() {
		casioCalculator casioCalculator = new casioCalculator();
		assertEquals (30, casioCalculator.addNumbers());
		
	}
	
	
	@Test
	public void testSimple() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(2);
		
		
		assertEquals(list1, list2);
		
	}
	
	
	@Test
	public void testAnother() {
		int x = 10;
		
		//1 is the delta
		assertEquals (12, x, 1);
		
	}
	

}
