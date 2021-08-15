package Array.medium;

public class MinimumNumberJumpsReachEnd {

	public static void main(String[] args) {
		int arr[] = {2,3,2,4,4};
		System.out.print(findMinJumsToEnd(arr));

	}

	private static int findMinJumsToEnd(int[] arr) {
		int current =0;
		int previous=0;
		int jumps =0;
		for(int i = 0; i<arr.length; i++){ //3
			if(i> previous) {  // 0 1 ,2 
				jumps = jumps+1;
				previous = current;				
			}
			current = Math.max(current,i+arr[i]);// 0,0+2   2,4 
			
		}
		return jumps;
	}

}
