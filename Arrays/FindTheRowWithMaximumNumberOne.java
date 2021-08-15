package Array.medium;

import java.util.Arrays;

public class FindTheRowWithMaximumNumberOne {

	public static void main(String[] args) {
		Integer arr[] []= {{0,0,1,1},{1,1,1,1},{2,3,4,5,1,1},{1,2,1,3,1,1,1,1},{1,1,2,3}};
		findTheHeighestOneRow(arr);

	}

	private static void findTheHeighestOneRow(Integer arr[][]) {
		int maxCountSubArray= 0;
		Integer arrMax[] = {} ;
		for(Integer [] subArray : arr){
			int maxCount = 0;
			for(Integer number : subArray) {
				if (number == 1)
					maxCount = maxCount+1;				
			}
			if (maxCount > maxCountSubArray) {				
				maxCountSubArray= maxCount;	
				arrMax = subArray;
			}
		}		
		System.out.println(" maxCountSubArray "+Arrays.asList(arrMax).toString());
	}

}
