package Array;

public class LargestSmallestNumberArray {

	public void findLargestAndSmallestNumber(int number[]) {
		
		int smallestNumber = number[0];
		int largestNumber = number[0];
		
		for(int i = 0; i<number.length; i++) {
			if(number[i] < smallestNumber)
				smallestNumber = number[i];
			else if(number[i] > largestNumber)
				largestNumber = number[i];			
		}	
		System.out.println(" smallestNumber is : "+smallestNumber +" largestNumber is : "+ largestNumber);
		
	}

	public static void main(String[] args) {
		int numbers[] = { 1, 3, 5, 11, 23, 34, 45, 89, 1234, 45678, -11, -890, 0 };
		new LargestSmallestNumberArray().findLargestAndSmallestNumber(numbers);
	}

}
