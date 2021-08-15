package Array.medium;

public class FirstThreeLargestNumberOfArray {

	
	
	public static void main(String[] args) {
	int arrNumber[] = {10,12,34,45,67,123,456,678,890,987,1234,3456};
	findThreeLargestNumber(arrNumber);

	}

	private static void findThreeLargestNumber(int[] arrNumber) {
		int first  =  Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third  = Integer.MIN_VALUE;
				
		for(int i =0; i<arrNumber.length; i++) {
			
			if(first < arrNumber[i]) {				
				third = second;	
				second = first;
				first = arrNumber[i];
			}else if (second < arrNumber[i]) {
				third = second;
				second = arrNumber[i];
			}else {
				third = arrNumber[i];
			}			
		}
		System.out.println("Three Largest Numbers are :"+first+" "+second+" "+third);
		
	}

}
