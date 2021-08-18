package Array.high;

public class LongestAlternatingSubSequence {

	public static void main(String[] args) {
	int arr[] = {8, 9, 6, 4, 5, 7, 3, 2, 4};
	System.out.println(findLongestAlternatingSubSequence(arr));
	}

	private static int findLongestAlternatingSubSequence(int[] arr) {
		int inc = 1;
		int dec = 1;
		int result = 1;
		for(int i = 1; i<arr.length; i++){
			if(arr[i]> arr[i-1]) {
				inc = dec+1;				
			}else if(arr[i]<arr[i-1]){
				dec = inc+1;				
			}	
			result = Math.max(inc, dec);
		}		
		return result;
	}

}
