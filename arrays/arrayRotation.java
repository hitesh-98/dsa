package arrays;

public class arrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void rotate(int[] arr, int k) {
		k = k%arr.length;
		
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length);
	}
	
	public static void reverse(int[] arr, int si, int ei) {
		int i = si;
		int j = ei;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
