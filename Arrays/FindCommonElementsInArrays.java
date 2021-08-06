package Array.medium;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsInArrays {
	
	

	public static void main(String[] args) {
		Integer arr1st [] = {1,2,3,4,5,6,7,8,9,10,20,25,30};
		Integer arr2nd [] = {5,10,15,20,25,30};
		Integer arr3rd [] = {5,10,20,25,50,234,456,678,999};
		
		findCommonElementsInArrays(arr1st,arr2nd,arr3rd );

	}

	private static void findCommonElementsInArrays(Integer[] ... inputSortedArrays) {
		
		
		HashSet hsCommonElements = new HashSet(Arrays.asList(inputSortedArrays[0]));
		for (Integer [] array : inputSortedArrays) {
			HashSet hsArray = new HashSet(Arrays.asList(array));
			hsCommonElements.retainAll(hsArray);			
		}
		System.out.println(hsCommonElements);
		
	}

}
