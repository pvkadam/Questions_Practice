
public class interval {
	int start;
	int end;
	
	interval() {
		start = 0;
		end = 0;
	}
	
	interval(int s, int e) {
		start = s;
		end = e;
	}
	
	public static void main (String[] args) {
		interval interval1 = new interval(2,5);
		System.out.print(interval1.end);
	}
}
