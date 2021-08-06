package Array.medium;

public class FindMissingInteger {

	public static void main(String[] args) {
		Integer arrNumber[] = {11,12,13,14,15,16,17,19};		
		findMissingInteger(arrNumber);
	}

	private static void findMissingInteger(Integer[] arrNumber) {
		int first = arrNumber[0];
			
		for(int i =0; i<arrNumber.length; i++) {
			if(arrNumber[i]!= first) {
				System.out.println(first);
			}			
			first = first+1;			
		}
		
	}

}
