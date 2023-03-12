package nagarro;

public class kadane {

	public static void main(String[] args) {
		int[] arr = {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};
		maxSubArraySum(arr);
	}
	
	public static void maxSubArraySum(int[] arr) {
		int sum = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(sum>=0)
				sum = sum+arr[i];
			else
				sum = arr[i];
			
			if(sum>max)
				max = sum;
		}
		System.out.println(max);
		
	}

}
