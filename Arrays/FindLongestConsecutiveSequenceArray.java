package Array.medium;

import java.util.HashSet;
import java.util.PriorityQueue;

public class FindLongestConsecutiveSequenceArray {

	// Returns length of the longest
		// consecutive subsequence
		static int findLongestConseqSubseq(int arr[], int n)
		{
			HashSet<Integer> S = new HashSet<Integer>();
			int ans = 0;

			// Hash all the array elements
			for (int i = 0; i < n; ++i)
				S.add(arr[i]);

			// check each possible sequence from the start
			// then update optimal length
			for (int i = 0; i < n; ++i)
			{
				// if current element is the starting
				// element of a sequence
				if (!S.contains(arr[i] - 1))
				{
					// Then check for next elements
					// in the sequence
					int j = arr[i];
					while (S.contains(j))
						j++;

					// update optimal length if this
					// length is more
					if (ans < j - arr[i])
						ans = j - arr[i];
				}
			}
			return ans;
		}	
		
		public static int findTheLongestConsecutiveSequence(int [] arrNumber) {
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();			
			for(int i = 0; i<arrNumber.length; i++)
				pq.add(arrNumber[i]);
			
			int prev = pq.poll();
			int counter =1;
			int max =1;
			
			for (int i =1; i<arrNumber.length; i++) {
				
				if(pq.peek() -prev == 1) {
					prev = pq.poll(); counter++; 
				}else {
					prev = pq.poll();
					counter=1;
				}
			/*
			 * if(pq.peek() -prev >1) { prev = pq.poll(); counter = 1; } else if(pq.peek()
			 * -prev == 0) { prev = pq.poll(); } else { counter ++; prev = pq.poll(); }
			 */
				if (max<counter)
					max = counter;
		   }			
			return max;			
		}
		// Driver Code
		public static void main(String args[])
		{
		 int arr[] = {1, 3,7,12,6, 10, 4, 20, 2 }; int n = arr.length;
		 //System.out.println( "Length of the Longest consecutive subsequence is " +
		 //findLongestConseqSubseq(arr, n));
		 
			System.out.println(findTheLongestConsecutiveSequence(arr));
			
			
		}

}
