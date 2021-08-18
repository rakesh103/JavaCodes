package Array.high;

import java.util.HashMap;

public class FindMissingAndRepeatingNumber {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7,4,8,8,9};
		int n= arr.length-1;
		findMissingAndRepeatingNumber(arr,n);
	}
	private static void findMissingAndRepeatingNumber(int[] arr, int n) {
		HashMap<Integer,Integer> hm = new HashMap();
		for(int i = 0; i<=n; i++) {
			if (hm.get(arr[i]) == null) {
				hm.put(arr[i], 1);
            }else {
                System.out.println("Repeating = " + arr[i]);
            }
		}		
		for(int i =0; i<n; i++) {
			if (hm.get(i) == null)
				System.out.println("Missing"+ i);
		}
	}
}
