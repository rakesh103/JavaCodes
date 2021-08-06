package Array.medium;

import java.util.HashMap;

public class FindFirstRepeatingElementAnArray {
	
	

	public static void main(String[] args) {
		Integer arrNumber[] = {11,12,13,14,15,14,16,17,19};		
		findRepeatingInteger(arrNumber);

	}

	private static void findRepeatingInteger(Integer[] arrNumber) {
		
		HashMap hm = new HashMap();
		for(int i =0; i<arrNumber.length; i++) {
			if(hm.containsKey(arrNumber[i])) {
				System.out.println("This is the 1st repeating element :: "+arrNumber[i]);
				break;				
			}
			hm.put(arrNumber[i], arrNumber[i]);
			
		}
		
	}

}
