package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOccuranceElementOfAnArray {
	
	public static void findOccuranceElements(int numberArray[]) {
		HashMap <Integer, Integer> hmNumberOccurance = new HashMap<Integer, Integer>();
		int counter= 1;
		int valueCount = 0;
		for (int i = 0; i<numberArray.length; i++) {
			if(hmNumberOccurance.containsKey(numberArray[i])) {
				valueCount= hmNumberOccurance.get(numberArray[i]);
				valueCount = valueCount+1;
				hmNumberOccurance.put(numberArray[i], valueCount);				
			}else {
				hmNumberOccurance.put(numberArray[i],counter );	
			}
		}
		Iterator <Map.Entry<Integer, Integer>>it = hmNumberOccurance.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entries = it.next();
			System.out.println("Key is :: "+entries.getKey()+" Value is :: "+entries.getValue());
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int numberArray [] = {1,1,2,3,4,5,6,6,7,8,9,9};
		findOccuranceElements(numberArray);

	}

}
