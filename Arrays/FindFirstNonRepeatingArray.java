package Array.medium;

import java.util.HashMap;

public class FindFirstNonRepeatingArray {
	
	public static void main(String[] args) {
		int arrNumber [] = {1,2,8,8,13,11,23,2,11,1};
		findFirstNonRepeating(arrNumber);

	}

	private static void findFirstNonRepeating(int[] arrNumber) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0; i<arrNumber.length; i++) {
				Integer count = hm.get(arrNumber[i]);	
				hm.put(arrNumber[i], (count == null) ? 1 : count+1);
			
		}
		
		for(int i =0; i<arrNumber.length; i++) {
			
			if(hm.get(arrNumber[i]) ==1) {
				System.out.println(" The 1st nonrepeatative element of an array"+arrNumber[i]);
				return ;
			}
			
		}
		
	}

}
