package Array.medium;

import java.util.HashMap;

public class FindTwoRepetitiveElementsInArray {

	public static void main(String[] args) {
		int arr[] = {10, 11, 12, 14, 10, 20 , 23,25,26,20, 30 , 34, 30};
		fondTwoRepeatativeElements(arr);

	}

	private static void fondTwoRepeatativeElements(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int repeatCounterCheck = 0;
		for(int i =0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {		
				repeatCounterCheck = repeatCounterCheck+1;
				System.out.println(" repeatCounterCheck"+repeatCounterCheck);
				System.out.print(" " + arr[i]);
			}
			//if(2== repeatCounterCheck)
				//break;
			hm.put(arr[i], arr[i]);
		}
		
	}

}
