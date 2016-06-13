import java.util.*;


public class mergeIntervals {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		if (intervals.size() == 0) {
			return result;
		}
		
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare (Interval i1, Interval i2) {
				if (i1.start != i2.start) {
					return i1.start - i2.start;
				}
				else {
					return i1.end - i2.end;
				}
			}
		});
		
		for (Interval i: intervals) {
			System.out.print(i.start);
			System.out.println(" " + i.end);
		}
		
		
		Interval first = intervals.get(0);
		for (int i = 0; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			
			if (current.start > first.end) {
				result.add(first);
				first = current;
			}
			
			else {
				Interval merged = new Interval(first.start, Math.max(first.end, current.end));
				first = merged;
			}
		}
		
		result.add(first);
		
//		System.out.println("--------------");
//		
//		for (Interval i: intervals) {
//			System.out.print(i.start);
//			System.out.println(" " + i.end);			
//		}
		
		return result;
		
	}
	
	public static void main (String[] args) {
		mergeIntervals mI = new mergeIntervals();
		
		ArrayList<Interval> item = new ArrayList<Interval>();
		
		item.add(new Interval(1,3));
		item.add(new Interval(2,6));
		item.add(new Interval(8,10));
		item.add(new Interval(15,18));
		
		mI.merge(item);
	}
	
}
