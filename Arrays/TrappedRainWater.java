package Array.high;

public class TrappedRainWater {
	
	

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		//int arr[] = {2,0,2};
		System.out.println(findTrapedRainWater(arr));
	}

	private static int findTrapedRainWater(int[] arr) {
		int left [] = new int[arr.length];
		int right[] = new int [arr.length];		
		left[0] = arr[0];
		right[arr.length-1] = arr[arr.length-1];
		int water = 0;
		
		for(int i =1; i<arr.length; i++)
			left[i] =Math.max(left[i-1], arr[i]);			
		for(int i = arr.length-2; i>=0; i--)
			right[i] = Math.max(right[i+1], arr[i]);
		for(int i = 0; i<arr.length; i++)
			water+= Math.min(left[i], right[i]) -arr[i];
		return water;
	}

}
