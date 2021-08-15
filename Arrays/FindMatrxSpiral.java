package Array.medium;

public class FindMatrxSpiral {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		findMatrixSpiral(arr);
	}

	private static void findMatrixSpiral(int[][] arr) {
		int w = 0;
		int x = arr.length - 1;
		int y = 0;
		int z = arr[0].length - 1;

		while (w <= x && y <= z) {

			for (int i = w; i <= z; i++)
				System.out.println(arr[w][i] + " ");
			for (int i = w + 1; i <= x; i++)
				System.out.println(arr[i][z] + " ");

			if (w + 1 <= x) {
				for (int i = z - 1; i >= 0; i--) {
					System.out.println(arr[x][i]);
				}
			}
			if (y + 1 <= z) {
				for (int i = x - 1; i > 0; i--) {
					System.out.println(arr[i][y]);
				}
			}
			w++;
			x--;
			y++;
			z--;
		}
	}
}
