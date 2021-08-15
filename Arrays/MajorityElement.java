package Array.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {8,8,3,4,5,2,2,6,7,8,8,8,8,8,8};
		System.out.println(findMajorityElement(arr));
	}

	private static int findMajorityElement(int[] arr) {
		int counter=1;
		int majorityElement = -1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length; i++){
			counter = hm.get(arr[i])== null? 1: hm.get(arr[i])+1;			
			hm.put(arr[i], counter);				
		}	
	
		for(Map.Entry<Integer, Integer> entrySet :hm.entrySet() ) {
			if (entrySet.getValue() > arr.length/2)
				majorityElement = entrySet.getKey();
		}
			
		
		return majorityElement;
	}
}
