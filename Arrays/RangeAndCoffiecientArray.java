package Array;

public class RangeAndCoffiecientArray {
	
	public static int getMax(int numberArray[]) {
		int res = numberArray[0];
		for(int i =0; i<numberArray.length; i++)
			res = Math.max(res,numberArray[i] );			
		return res;
	}
	public static int getMin(int numberArray[]) {
		int res = numberArray[0];
		for(int i =0; i<numberArray.length; i++)
			res = Math.min(res,numberArray[i] );			
		return res;
	}
	
	public static void findRangeAndCoffiecient(int numberArray[]) {
		int max = getMax(numberArray);
		int min = getMin(numberArray);
		int range = max - min;
		int coeffiecient = range/max+min;		
		System.out.println("Max value is "+max+" min value is "+min);
		System.out.println(" range is :: "+ range+" coeefiencient "+ coeffiecient);
	}
	
	public static void findRangeANdCoeffie(int numberArray[]) {
		int maxValue = numberArray[0];
		int minValue = numberArray[0];
		
		for (int i = 0; i<numberArray.length; i++) {
			if(numberArray[i] < minValue)
				minValue = numberArray[i];
			if(numberArray[i]> maxValue)
				maxValue = numberArray[i];
		}
		int range = maxValue-minValue;
		int coeffiecient = range/maxValue+minValue;
		
		System.out.println(" min value is ::"+minValue+" max value is ::"+maxValue);
		System.out.println(" range value is ::"+range+" coeffiecient value is ::"+coeffiecient);
	}
	

	public static void main(String[] args) {
		int numberArray [] = {2, 11, 22, 34, 45,89,999,4,5,6,7};
		//findRangeAndCoffiecient(numberArray);		
		findRangeANdCoeffie(numberArray);
	}

}
