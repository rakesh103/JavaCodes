package Array.medium;

import java.util.HashSet;

public class FindTripletSumValue {
	public static void main(String[] args) {
		Integer num[] = {2,34, 11, 23, 56, 18, 3, 4, 10};
		int sumValue = 30;
		findTripletSumValue(num,sumValue);
	}

	private static void findTripletSumValue(Integer[] num, int sumValue) {
		int CurrentSum = 0;
		for(int i = 0; i<num.length; i++){
			CurrentSum = sumValue-num[i];
			HashSet hs = new HashSet();
			for(int j = 0; j<num.length; j++) {
				if (hs.contains(CurrentSum -num[j])) {
					System.out.print(" "+ num[i]+" "+num[j]+" "+(CurrentSum -num[j]));
				}
				hs.add(num[j]);				
			}			
		}		
	}
}
