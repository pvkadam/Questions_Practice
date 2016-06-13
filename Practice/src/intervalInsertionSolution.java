import java.util.*;

public class intervalInsertionSolution {
	
	int firstPoint, lastPoint, numberOfIntervals;
	int newMergedStart, newMergedEnd;
	
	public ArrayList<interval> insert(ArrayList<interval> intervals, interval newInterval) {
		
		firstPoint = newInterval.start;
		lastPoint = newInterval.end;
		numberOfIntervals = intervals.size();
				
		ArrayList<interval> finalResult = new ArrayList<interval>();		
		
		
		
		for (int i = 0; i < numberOfIntervals; i++) {
			
			//if firstPoint is inside a subinterval
			if (intervals.get(i).start < firstPoint && intervals.get(i).end > firstPoint) {
				
				
				
			}
			
			//if firstPoint is not within any interval
			else {
				
			}
		}
		
		return finalResult;
		
		
	}
}
