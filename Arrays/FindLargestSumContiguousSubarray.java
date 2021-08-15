package Array.medium;

public class FindLargestSumContiguousSubarray {

	public static void main(String[] args) {
		int arrNumbers[] = {1, 2, -3, 7, 2,-1,7,8,-10};
		System.out.println(findLargestSumContigousArray(arrNumbers));
	}

	private static int findLargestSumContigousArray(int[] arrNumbers) {
		int maxContiguousSum = 0;
		int maxSum = 0;
		
		for(int i =0; i<arrNumbers.length; i++) {
			maxSum = maxSum+arrNumbers[i];
			if (maxSum > maxContiguousSum)
				maxContiguousSum = maxSum;			
		}
		return maxContiguousSum;
	}

}
