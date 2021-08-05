package Array;

import java.util.HashMap;

public class TwoIntegerNumberMultiplyArray {

	public static void multiplyTwoIntTo20(int arrNumber[]) {
		int twoIntMulti = 20;
		for (int i = 0; i < arrNumber.length; i++) {
			int searchingNumber = twoIntMulti / arrNumber[i];
			for (int j = 0; j < arrNumber.length; j++) {
				if (arrNumber[j] == searchingNumber) {
					System.out.println(arrNumber[j] + "  " + arrNumber[i]);
					break;
				}
			}
		}
	}

	public static void multiTwoIntTo20(int arrNumber[]) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrNumber.length; i++) {
			if (20 % arrNumber[i] == 0 && hm.containsKey(20 / arrNumber[i])) {
				System.out.println(arrNumber[i] + "----" + hm.get(20 / arrNumber[i]));
			}
			hm.put(arrNumber[i], arrNumber[i]);
		}
	}

	public static void main(String[] args) {
		int arrNumber[] = { 4, 1, 2, 3, 5, 10 };
		// new MultiplyTwoNumbersTo20().multiplyTwoIntTo20(arrNumber);

		new TwoIntegerNumberMultiplyArray().multiTwoIntTo20(arrNumber);
	}

}
