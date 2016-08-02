/*
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.
 */
import java.util.*;
public class mergeIntervals {

	   public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	        
	        ArrayList<Interval> result = new ArrayList<Interval>();
	        
	        for (Interval i: intervals) {
	            if (i.end <= newInterval.start) {
	                result.add(i);
	            }
	            
	            else if (i.start >= newInterval.end) {
	                result.add(newInterval);
	                newInterval = i;
	            }
	            
	            else if (i.start <= newInterval.end || i.end >= newInterval.start) {
	                newInterval = new Interval(Math.min(i.start, newInterval.start), Math.max(i.end, newInterval.end));
	            }
	        }
	        
	        result.add(newInterval);
	        
	        return result;
	    }
}
