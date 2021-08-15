package Array.medium;

public class FindTheMinimumElementRotatedSortedArray {

	public static void main(String[] args) {
		int array[] = {16,19,21,25,4,5,8,10};
		System.out.println(findMinRotatedArray(array));

	}

	private static int findMinRotatedArray(int[] array) {
		int start =0;
		int end = array.length-1;
				
		if (array[start] <= array[end])
			return array[start];
		
		while (start<end) {		
			int mid = start +end /2;
			System.out.println(" mid "+mid );
			
			if(mid > 0 && array[mid] < array[mid-1])
				return array[mid];
			if(mid < array.length && array[mid] > array[mid+1])
				return array[mid+1];
			if (array[mid] >= array[start])
				start = mid+1;
			else
				end = mid;	
		}
				
		return -1;
		
		
	}

}
