import java.util.*;


public class medianRavi {
	
	
	//important to add + 1 to k value
	public static int findMedian (int[] array) {
		return helper (array, array.length/2 + 1, 0, array.length - 1);
	}
	
	public static int helper (int[] array, int k, int low, int high) {
		if (low == high) {
			return array[low];
		}
		
		int m = partition(array, low, high);
		
		int length = m - low + 1;
		
		if (length == k) {
			return array[m];
		}
		
		//go left
		if (length > k) {
			return helper (array, k, low, m -1);
		}
		
		else {
			return helper (array, k - length, m + 1, high);
		}
		
	}
	
	private static int partition(int[] array, int low, int high) {
		int pivotValue = getPivotValue(array, low, high);
		
		while (low < high) {
			while (array[low] < pivotValue) {
				low++;
			}
			
			while (array[high] > pivotValue) {
				high--;
			}
			
			if (array[low] == array[high]) {
				low++;
			}
			
			else if (low < high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			}
			
		}
		
		return high;
		
	}
	
	
	private static int getPivotValue (int[] array, int low, int high) {
		//base case if number of elements in array is less than 10
		
		if (high - low + 1 <= 9) {
			Arrays.sort(array);
			return array[array.length/2];
		}
		
		//create 3 fields: int temp[] to store 5 elements, int median[] to store median values, int medianIndex for index
		
		int temp[] = null;
		
		int medians[] = new int[(int)Math.ceil((double)(high-low + 1)/5)];
		int medianIndex = 0;
		
		
		while (low <= high) {
			temp = new int[Math.min(5, high - low + 1)];
			
			//store 5 values in temp
			for (int i = 0; i < temp.length && low <= high; i++) {
				temp[i] = array[low];
				low++;
			}
			
			//calculate median and store it it median array and update medianIndex
			Arrays.sort(temp);
			
			medians[medianIndex] = temp[temp.length/2];
			medianIndex++;
			
		}
		
		return getPivotValue(medians, 0, medians.length -1);
		
	}
	
	public static void main (String[] args) {
		int[] arr = { 4  , 19  , 18  , 17  , 13  , 5  , 8  , 8  , 17  , 2  , 17  , 15  , 3  , 6  , 14  , 0  , 2  , 14  , 13  , 5  , 14  , 14  , 8  , 3  , 15  , 9  , 2  , 4  , 13  , 0  , 10  , 12  , 18  , 12  , 18  , 5  , 12  , 0  , 9  , 18  , 12  , 12  , 1  , 2  , 3  , 14  , 15  , 16  , 12  , 1  , 11  , 3  , 10  , 8  , 7  , 5  , 8  , 19  , 11  , 7  , 1  , 11  , 16  , 6  , 16  , 3  , 10  , 8  , 19  , 5  , 5  , 10  , 16  , 15  , 19  , 7  , 4  , 6  , 6  , 5  , 8  , 4  , 9  , 5  , 5  , 13  , 14  , 11  , 3  , 18  , 3  , 17  , 5  , 1  , 17  , 13  , 12  , 7  , 9  , 17  , 8  , 10  , 0  , 9  , 3  , 19  , 17  , 17  , 0  , 3  , 17  , 1  , 2  , 13  , 10  , 2  , 7  , 3  , 17  , 18  , 0  , 6  , 7  , 0  , 15  , 5  , 0  , 13  , 14  , 12  , 17  , 15  , 9  , 8  , 19  , 8  , 9  , 8  , 12  , 3  , 1  , 1  , 16  , 16  , 4  , 7  , 4  , 4  , 14  , 10  , 10  , 1  , 14  , 6  , 17  , 18  , 12  , 1  , 12  , 16  , 7  , 15  , 12  , 13  , 1  , 5  , 14  , 12  , 12  , 12  , 14  , 19  , 19  , 13  , 8  , 4  , 9  , 15  , 13  , 19  , 9  , 2  , 8  , 19  , 13  , 3  , 10  , 4  , 0  , 14  , 7  , 8  , 18  , 4  , 16  , 12  , 16  , 9  , 6  , 6  , 5  , 3  , 3  , 5  , 0};
		System.out.println(findMedian(arr));
	}
	
}
