package Array.medium;

import java.util.HashSet;

public class FindSubarraySumEqualToZero {

	public static void main(String[] args) {
		int arrNumber[] = {1,2,-3};
		int arrNumber1[] = {1,2,-3,4};
		int arrNumber2[] = {1,2,-9,0};
		int arrNumber3[] = {4,2,-3,1,6};
		int arrNumber4[] = {-3,2,3,1,6};		
		System.out.println(findSubArraySumEqualToZero(arrNumber3));
	}

	private static boolean findSubArraySumEqualToZero(int [] arrNumber) {
		int sum = 0;
		HashSet set = new HashSet();
		for(int i =0; i<arrNumber.length; i++) {
			sum = sum+arrNumber[i];		
			System.out.println(sum );
			if(arrNumber[i] == 0 || sum == 0 || set.contains(sum))
				return true;
			set.add(sum);
		}
		return false;
	}

}
