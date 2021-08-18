package Array.high;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int arr[] = {1,5,10};
		int number = 12;
		System.out.println(getNumberOfWays(arr,number));
	}

	private static int getNumberOfWays(int[] arr, int number) {
		int ways[] = new int[number+1];
		ways[0] = 1;
		for(int i =0; i<arr.length; i++){
			for(int j = 0; j<ways.length; j++) {
				if(arr[i] <=j)
				 ways[j] = ways[j]+ ways[j-arr[i]];					
			}
	}	
		return ways[number];
	}

}
