package Array.medium;

import java.util.HashMap;

public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		Integer arrNumbers[] = {10,22,33, 44,6,7,8,9,22,6,1120,2345,6789,1120};
		findDuplicatesInAnArray(arrNumbers);

	}

	private static void findDuplicatesInAnArray(Integer[] arrNumbers) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0; i<arrNumbers.length; i++) {
			if(hm.containsKey(arrNumbers[i]))
				System.out.println("Duplicate Values are :: "+arrNumbers[i]);
			hm.put(arrNumbers[i], arrNumbers[i]);
		}
		
	}

}
