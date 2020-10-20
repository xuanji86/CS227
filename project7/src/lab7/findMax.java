package lab7;

public class findMax {
	public static void main(String[] args) {
		int[] test = {3,4,5,1,2,9,8};
		int result = findMax(test);
		System.out.println(result);
	}
	
	public static int findMax(int[] arr) {
		return max(arr, 0, arr.length-1);
	}
	
	private static int max(int[] arr, int start, int end) {
		if(start == end) {
			return arr[start];
		}else {
			int mid = (start + end)/2;
			int leftMax = max(arr, start, mid);
			int rightMax = max(arr, mid+1, end);
			return Math.max(leftMax, rightMax);
		}
	}
}
