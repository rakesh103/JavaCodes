package Array.medium;

import java.util.Arrays;

public class CyclicalRotateByOne {

	public static void showCyclicalRotateArrayByOne(int arr[]) {
		
		int n = arr.length;
		int last = arr[arr.length-1];
		
		for(int i = n-1; i>0; i--)
			arr[i] = arr[i-1];
		    arr[0] = last;
		    System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 5 };
		showCyclicalRotateArrayByOne(number);
	}

}
