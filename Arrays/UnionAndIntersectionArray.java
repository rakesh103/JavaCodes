package Array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UnionAndIntersectionArray {

	public static void findUnionAndInterSection(Integer[]... inputArrays) {
		HashSet<Integer> hsUnionNumbers = new HashSet<Integer>();

		for (Integer[] arrays : inputArrays) {
			for (Integer i : arrays) {
				hsUnionNumbers.add(i);
			}
		}
		HashSet hsIhsIntersection = new HashSet(Arrays.asList(inputArrays[0]));
		for (int i = 0; i < inputArrays.length; i++) {
			HashSet hsIntersectionNumbers = new HashSet(Arrays.asList(inputArrays[i]));
			hsIhsIntersection.retainAll(hsIntersectionNumbers);
		}
		Iterator it = hsUnionNumbers.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
		System.out.print(" " + hsIhsIntersection);
	}
	
	
	public static void findUnionAndintersectionArray(Integer[] ...inputArrays) {
		
		HashSet<Integer> hsUnion = new HashSet<Integer>();
		
		HashSet hsIntersection = new HashSet(Arrays.asList(inputArrays[0]));
		System.out.println(hsIntersection.size());
		
		for (Integer [] array : inputArrays) {	
			HashSet hs = new HashSet(Arrays.asList(array));
			hsIntersection.retainAll(hs);
			for (Integer number : array) {
				hsUnion.add(number);				
			}
		}	
		
		System.out.println(" union numbers are :: "+hsUnion);		
		System.out.println("  hsIntersection --"+hsIntersection);		
	}

	public static void main(String[] args) {
		Integer firstNumberArray[] = { 10, 5, 15, 34, 45, 23, 11, 90, 112, 34567, 67890 };
		Integer secondNumberArray[] = { 10, 5, 15, 3, 9, 6, 34, 34567, 67890, 7, 13, 39, 41, 22 };
		Integer thirdNumberArray[] = { 10, 5, 15, 55555,999999 };
		
		//findUnionAndInterSection(firstNumberArray, secondNumberArray);
		findUnionAndintersectionArray(firstNumberArray,secondNumberArray,thirdNumberArray);

	}

}
