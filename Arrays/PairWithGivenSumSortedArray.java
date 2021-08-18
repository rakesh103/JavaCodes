package Array.high;

import java.util.HashSet;

public class PairWithGivenSumSortedArray {

	public static void main(String[] args) {
		int arr[] = {11,15,26,38,9,10}; //{11,15,26,38,9,10};//{ 11, 15, 6, 8, 9, 10 };
		int sum = 45;//35;//16;
		
		System.out.println(findPairWithGivenSumSortedArray(arr, sum));
	}

	private static boolean findPairWithGivenSumSortedArray(int[] arr, int sum) {
		HashSet numbersSet = new HashSet();
		boolean pairMatched = false;
		int pair = 0;
		for (int i = 0; i < arr.length; i++) {
			pair = sum - arr[i];
			if (numbersSet.contains(pair)) {
				System.out.println(" " + pair + " " + arr[i]);
				pairMatched = true;
			}
			
			numbersSet.add(arr[i]);
		}
		if(!pairMatched)
			System.out.printf("There is no piar with the sum %d%n",sum);
		return pairMatched;
	}

}
