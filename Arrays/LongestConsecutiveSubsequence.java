package Array.high;

import java.util.PriorityQueue;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		int arr[] = {1,9,3,10,4,20,2};	
		int n= arr.length-1;
		System.out.println(findLongestConsecutiveSubsequence(arr,n));
	}

	private static int findLongestConsecutiveSubsequence(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i<arr.length; i++)
			pq.add(arr[i]);
		int prev = pq.poll();
		int max = 1;
		int counter=1;
		for(int i =0; i<n; i++) {
			if(pq.peek() - prev ==1) {
				System.out.println(prev);
				counter++;
				prev = pq.poll();		
			}else {
				pq.poll();
				counter=1;
			}
			if(max<counter)
				max= counter;
		}
		return max;
	}

}
