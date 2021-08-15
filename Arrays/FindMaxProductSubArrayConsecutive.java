package Array.medium;

public class FindMaxProductSubArrayConsecutive {

	public static void main(String[] args) {
		int [] arrNumber = {3,8,5,-2,-5,-6,7,-3};
		findMaxProductSubArray(arrNumber);
	}
	private static void findMaxProductSubArray(int[] arrNumber) {
		int [] max_ending =new int[arrNumber.length];
		int [] min_ending= new int[arrNumber.length];;
		int max_sofar= arrNumber[0];
		max_ending[0] = min_ending[0];
		
		for(int i = 1; i<arrNumber.length; i++) {			
				max_ending [i] = Math.max(arrNumber[i], (arrNumber[i]* arrNumber[i-1]));
				min_ending [i] = Math.min(arrNumber[i], (arrNumber[i]* arrNumber[i-1]));				
			max_sofar = Math.max(max_sofar,max_ending [i]);		
		}
		System.out.println(" max_sofar is :: "+max_sofar);
	}

}
