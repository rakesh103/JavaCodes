package Array.high;

public class MaximumSumPathArrays {

	public static void main(String[] args) {
		//int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 };
		//int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 };
		int ar1[] = {10, 12};
	    int ar2[] = {5, 7, 9};
		int m = ar1.length;
		int n = ar2.length;
		System.out.println(findMaxSumPathArrays(ar1,ar2,m,n));
	}
	private static int max(int x, int y) {
		return (x>y)?x:y;
	}
	private static int findMaxSumPathArrays(int[] ar1, int[] ar2, int m, int n) {
		int i = 0; int j =0;
		int results= 0;
		int sum1=0;
		int sum2=0;
		
		while(i<m && j<n) {
			
			if(ar1[i]<ar2[j])
				sum1+= ar1[i++];
			else if(ar1[i]>ar2[j])
				sum2+= ar2[j++];
			else {
				results+=max(sum1,sum2)+ar1[i];
				sum1=0;
				sum2=0;
				i++;
				j++;
			}			
		}
		while(i<m)
			sum1+=ar1[i++];
		while(j<n)
			sum2+=ar2[j++];
		
		results +=max(sum1,sum2);
		
		
		return results;
		
	}

}
