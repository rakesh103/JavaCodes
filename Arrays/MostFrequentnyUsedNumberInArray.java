package Array.medium;

import java.util.HashMap;

public class MostFrequentnyUsedNumberInArray {

	public static void main(String[] args) {
		Integer arrNumber [] = {1,1,1,1,2,3,4,3,5,6,3};
		findMostFrequentUsedNumber(arrNumber);

	}

	private static void findMostFrequentUsedNumber(Integer[] arrNumber) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int value = 1;
		int maxCount = 0;
		int maxItem =0;
		for(int i = 0; i<arrNumber.length; i++) {
			if(hm.containsKey(arrNumber[i])) {
				hm.put(arrNumber[i],hm.get(arrNumber[i])+1 );
			}else {
				hm.put(arrNumber[i], value);
			}			
			if(hm.get(arrNumber[i]) >maxCount) {
				maxCount = hm.get(arrNumber[i]);
				maxItem = arrNumber[i];
			}
		}
		
		System.out.println("maxOccurance is : "+maxItem + hm);
	}

}
