package Array.medium;

import java.util.HashMap;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		Integer arrNumber[] = {1,2,3,4,5,6,7,8,0,10};
		int sum = 10;
		countPairsWithGivenSum(arrNumber,sum);
		

	}

	private static void countPairsWithGivenSum(Integer[] arrNumber, int sum) {
		HashMap hm = new HashMap();
		for (int i = 0; i<arrNumber.length; i++) {
			int valueTwo = sum-arrNumber[i];
			if (hm.containsKey(valueTwo)) {
				System.out.println("value pairs are for sum :: "+valueTwo+ " -- "+arrNumber[i]);				 
			}
			hm.put(arrNumber[i], arrNumber[i]);
			
		}
		
	}

}
