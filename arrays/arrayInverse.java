package arrays;

public class arrayInverse {

	public static void main(String[] args) {
		int[] arr = {2,1,3,0};
		inverse(arr);

	}
	
	public static void inverse(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			result[arr[i]] = i;
		}
		
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
	}

}
