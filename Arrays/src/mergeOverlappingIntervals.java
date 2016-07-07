/*
 * Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
 */
import java.util.*;
public class mergeOverlappingIntervals {
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
		
		return result;
        
        
    }
}
