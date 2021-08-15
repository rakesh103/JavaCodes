package Array.medium;

public class WaveArrayAndSorting {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4 };
		System.out.print(isWaveArray(arr));
		int arrNumbers[] = {10, 90, 49, 2, 1, 5, 23};
		int n = arrNumbers.length;
		sortingWebArray(arrNumbers, n);
		
		for(int number : arrNumbers)
			System.out.print(" "+number);
		
		

	}

	/// Checking the array is a web array or not
	private static boolean isWaveArray(int[] arr) {
		boolean result = false;
		if (arr[1] > arr[0] && arr[1] > arr[2]) {
			for (int i = 1; i < arr.length - 1; i += 2) {
				if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
					result = true;
				} else {
					result = false;
				}
			}
			if (result == true && arr.length % 2 == 0) {
				if (arr[arr.length - 1] <= arr[arr.length - 2]) {
					result = false;
				}
			}
		}
		if (arr[1] < arr[0] && arr[1] < arr[2]) {
			for (int i = 1; i < arr.length - 1; i += 2) {
				if (arr[1] < arr[i - 1] && arr[1] < arr[i + 1]) {
					result = true;
				} else
					result = false;
			}
			if (result == true && arr.length % 2 == 0) {
				if (arr[arr.length - 1] >= arr[arr.length - 2])
					result = false;
			}
		}
		return result;
	}
	
	public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a]= arr[b];
		arr[b] = temp;		
	}	
	public static void sortingWebArray(int[] arr, int n){
		
		for(int i =1; i<arr.length; i+=2){
			if (i>0 && arr[i-1] > arr[i] )
				swap(arr, i-1, i);
			if (i<n-1 && arr[i] < arr[i+1] )
				swap(arr, i, i + 1);
		}		
	}

}
