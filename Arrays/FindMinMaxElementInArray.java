package Array;

public class FindMinMaxElementInArray {
	
	public static void findMinMaxElement(int arrNumber[]) {
		
		int minValue = arrNumber[0];
		int maxValue = arrNumber[0];
		
		for (int i = 0; i<arrNumber.length; i++) {
			if(arrNumber[i]< minValue)
				minValue = arrNumber[i];
			if (arrNumber[i] > maxValue )
				maxValue = arrNumber[i];
		}
		
		System.out.println("min value is :: "+minValue+" max value is :: "+maxValue);
			
	}

	public static void main(String[] args) {
		int arrNumber[] = { 4, 1, 2, 3, 5, 10 };
		
		findMinMaxElement(arrNumber);
	}

}
