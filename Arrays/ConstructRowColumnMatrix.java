package Array.medium;

public class ConstructRowColumnMatrix {
	
	public static void main(String args[]) {
		int matrix[][] = {{5,10,15},{2,4,6},{8,10,12}};
		constructAMatrix(matrix);
	}

	private static void constructAMatrix(int[][] matrix) {
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix.length; j++) {				
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}

}
