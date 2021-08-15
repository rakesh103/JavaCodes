package Array.medium;

public class ImplementTwoStackInArray {
	int size;
	int top1;
	int top2;
	int arr[];

	ImplementTwoStackInArray(int n) {
		size = n;
		top1 = -1;
		top2 = n;
		arr = new int[n];
	}

	void push1(int x) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		}
	}

	void push2(int x) {
		if (top1 <= top2 - 1) {
			top2--;
			arr[top2] = x;
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;	
			return x;
		}
		return 0;
	}
		
	int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;	
			return x;
		}
		return 0;		
	}
	
	public static void main(String[] args) {
		ImplementTwoStackInArray objImplementTwoStackInArray = new ImplementTwoStackInArray(5);
		objImplementTwoStackInArray.push1(5);
		objImplementTwoStackInArray.push1(10);
		objImplementTwoStackInArray.push2(15);
		objImplementTwoStackInArray.push2(20);
		objImplementTwoStackInArray.push1(11);
		
		
		System.out.println(" pop2 vale "+objImplementTwoStackInArray.pop2());
		System.out.println(" pop1 vale "+objImplementTwoStackInArray.pop1());
		
		

	}

}
