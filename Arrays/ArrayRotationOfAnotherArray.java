package Array.medium;

public class ArrayRotationOfAnotherArray {

	public static void main(String[] args) {
		int arrNumber1 []  = {1,2,3,4,5,6,7};
		int arrNumber2[] = {4,5,6,7,1,2,3}; 
		
		isRotationArrayNumbers(arrNumber1,arrNumber2);

	}

	private static boolean isRotationArrayNumbers(int[] arrNumber1, int[] arrNumber2) {
		
		int key = arrNumber1[0];
		int key_loc = -1;
		
		if(arrNumber1.length != arrNumber2.length)
			return false;
		for(int j = 0; j<arrNumber2.length;j++) {		
			if(arrNumber2[j] == key) {
				key_loc = j;
			    break;		
			}
		}
		if(key_loc == -1)
			return false;
		
		System.out.println("arrNumber1.length is "+arrNumber1.length);
		
		for(int i = 0; i<arrNumber1.length;i++) {
			int j = (key_loc+i) % arrNumber1.length;		
			System.out.println("key_loc is :: "+key_loc);
			if(arrNumber1[i]!= arrNumber2[j])
				return false;
		}
		return true;
	}

}
