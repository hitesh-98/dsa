package BitManipulation;

public class MissingNoInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7};
		System.out.println(misingNo(arr));
	}
	
	public static int misingNo(int[] arr) {
		
		int xor = 0;
		for (int i=0; i<arr.length; i++) {
			xor = (arr[i]^(i+1));
		}
		
		xor = (xor^(arr.length-1));
		
		return xor;
	}

}
