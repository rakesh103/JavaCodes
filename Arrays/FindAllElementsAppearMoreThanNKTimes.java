package Array.medium;

import java.util.HashMap;
import java.util.Map;

public class FindAllElementsAppearMoreThanNKTimes {

	public static void main(String[] args) {
		int arrNumbers [] = {8,8,2,2,2,2,4,4,4,5,6,7,7,8,7,7,4,8};
		int k = 4;
		int n = arrNumbers.length;
		findAllElements(arrNumbers,n,k);

	}

	private static void findAllElements(int[] arrNumbers, int n, int k) {
		int numberOfTimes = n/k;
		int counter = 1;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0; i<n; i++) {			
			counter = hm.get(arrNumbers[i]) == null ? 1: hm.get(arrNumbers[i])+1;
			hm.put(arrNumbers[i], counter); 
		}
	   for(Map.Entry<Integer, Integer> entrySet : hm.entrySet()) {
		   if (entrySet.getValue() == numberOfTimes)
			   System.out.println(" "+entrySet.getKey());		   
	   }
		
	}

}
