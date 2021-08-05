package Array;

import java.util.Arrays;
import java.util.Collections;

public class SortAndReverseArray {
	/*Reverse order of an Array 
	 * */
	public static void collectionsReverseArray(Integer arrNumber[]) {		
		Collections.reverse(Arrays.asList(arrNumber));
		System.out.println("Colection reverse order ::"+Arrays.asList(arrNumber));
	}
	public static void reverseArraySwap(int arrNumber[]) {		
		int start = 0;
		int end = arrNumber.length-1;
		while(start<end) {
			
			int temp = arrNumber[start];
			arrNumber[start] = arrNumber[end];
			arrNumber[end]= temp;
			start ++;
			end --;				
		}
		
		for (int num : arrNumber) {
			System.out.print(" "+num);
		}
	}
	
	public static void loopingReverseArray(int arrNumber[]) {
		for (int i =arrNumber.length-1; i>=0; i--) {
			System.out.print(" "+arrNumber[i]);
			
		}
	}
	
	public static int reverseANumber(int number) {
		int reverse = 0;
		int remainder = 0;
		
		while(number !=0) {
			
			remainder = number %10;
			
			reverse = reverse*10 + remainder;
			number = number/10;
			
		}
		return reverse;
	}
	
	/*Sorting of array 
	 * */
	
	public static void sortArray(Integer arrNumber []) {		
		Collections.sort(Arrays.asList(arrNumber));		
		System.out.println("arrays sort using collections :: "+ Arrays.asList(arrNumber));
		Arrays.sort(arrNumber, 0, arrNumber.length, Collections.reverseOrder());
		System.out.printf("Modified arr[] : %s",
                Arrays.toString(arrNumber));		
	}
	
	public static void sortingArray(int arrNumber []) {		
		
		for (int i=0; i<arrNumber.length; i++) {
			for (int j= i+1; j<arrNumber.length; j++) {
				if (arrNumber[i] < arrNumber[j] ) {
					int temp = arrNumber[i];
					arrNumber[i] = arrNumber[j];
					arrNumber[j] = temp;					
				}
			}
		}
		System.out.println(Arrays.toString(arrNumber));
	}

	public static void main(String[] args) {
		int arrNumber [] = {1,2,3,45,56,67,12,11,10, 345,567,1123};
		int arrNumbers []= {0,-1, -2, -3,1,2,0,1,2,-8,-9,-11,78,65,123,87};
		//collectionsReverseArray(arrNumber);
		//reverseArraySwap(arrNumber);
		//loopingReverseArray(arrNumber);
		//int number = 78901;
		//System.out.println(reverseANumber(number));
		//sortArray(arrNumber);
		sortingArray(arrNumbers);
	}

}
