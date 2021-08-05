package Array;

public class FindXElementSegmentArray {
	
	public static boolean findElementInSegments(int numbers[], int checkNumber, int segmentNumber) {
		
		int j = 0;
		boolean checkNumberFoundInSegments = false;
		for(int i =0; i<numbers.length; i=i+segmentNumber) {
			
			for (j= i; j<i+segmentNumber; j++) {
				if (numbers[j] == checkNumber && j<numbers.length)
					break;
				else if(j>numbers.length || j == i+segmentNumber-1)
					return false;
			}
			
		}
		if(j<numbers.length)
			return true;		
		
		return checkNumberFoundInSegments;
		
	}

	public static void main(String[] args) {
		int numbers [] = {1,2,4,4,11,5,6,7,6,8,9,4};
		int checkNumber = 4;
		int segmentNumber = 3;
		
		System.out.println(findElementInSegments(numbers,checkNumber ,segmentNumber));

	}

}
