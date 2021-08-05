package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateElementArray {

	public void findDuplicateElements(int numbers[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!hm.containsKey(numbers[i]))
				hm.put(numbers[i], numbers[i]);
			else
				System.out.println(numbers[i] + " is a duplicate value");
		}
	}
	
	public void DuplicateElements(int numbers[]) {		
		HashSet  hsNumbers = new HashSet();
		for (int i = 0; i<numbers.length; i++) {
			if(!hsNumbers.contains(numbers[i]))
				hsNumbers.add(numbers[i]);
		}		
		
	   Iterator set = hsNumbers.iterator();
	   while (set.hasNext())
		   System.out.println(" elements are :: "+set.next());
	
		
	}
	

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 23, 23, 23, 45, 45, 56, 57, 58, 80 };

		//new DuplicateElementArray().findDuplicateElements(numbers);
		new DuplicateElementArray().DuplicateElements(numbers);
	}

}
