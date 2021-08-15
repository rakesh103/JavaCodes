package Array.medium;

public class FindLargestAdjacesntSumSubarray {

	public static void main(String[] args) {
		int arrNumbers[] = {9,8,10,7,3,4,6,7}; 
		System.out.println(findTheSumOFContiguousArray(arrNumbers));
	}

	private static int findTheSumOFContiguousArray(int[] arrNumbers) {		
		int contiguousSum = 0;
		int sum = 0;
		for(int i =0; i<arrNumbers.length; i++) {
		  sum = i ==0 ?sum+arrNumbers[i] :arrNumbers[i] + arrNumbers[i-1];				
			if(sum > contiguousSum)
				contiguousSum = sum;
		}		
		return contiguousSum;
	}

}
