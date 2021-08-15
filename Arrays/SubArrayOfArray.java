package Array.medium;

import java.util.HashSet;

public class SubArrayOfArray {

	public static void main(String[] args) {
		int superArray[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		int subArray[] = { 2, 3, 4 };
		System.out.println(findSubsetOfArray(superArray, subArray));
	}

	private static boolean findSubsetOfArray(int[] superArray, int[] subArray) {
		HashSet subSetArray = new HashSet();
		int counter = 0;
		for (int i = 0; i < subArray.length; i++)
			subSetArray.add(subArray[i]);
		for (int j = 0; j < superArray.length; j++) {
			if (subSetArray.contains(superArray[j]))
				return true;
		}
		return false;

	}

}
