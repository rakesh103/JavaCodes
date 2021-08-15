package Array.medium;

public class FindTheLargestNumberArrayandFactorial {

	public static void main(String[] args) {
		int arrNumbers [] = {2,3,5,7,-8,-1,-2,6,9,0};		
		findTheLargestAndFactNumber(arrNumbers);
	}
	private static void findTheLargestAndFactNumber(int[] arrNumbers) {
		int maxNumber = 0;
		int factNumer = 1;
		for(int i = 0; i <arrNumbers.length; i++) {			
			if(arrNumbers[i] >maxNumber)				
				maxNumber = arrNumbers[i];
		}
		System.out.println("MaxNumber is :: "+ maxNumber);		
		for (int i =maxNumber; i>1; i--) {
			factNumer = factNumer*i;
		}
		System.out.println("FactNumer is ::"+factNumer);
	}

}
