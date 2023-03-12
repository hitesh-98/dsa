package arrays;

public class maxSubArraySum {

	public static void main(String[] args) {
		int[] arr = {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};
		//int max = maxsubarraySum(arr);
		int max = kadane(arr);
		System.out.println(max);
	}
	
	public static int maxsubarraySum(int[] arr) {
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for (int j=0; j<arr.length; j++)
			{
				sum = sum+arr[j];
				if(sum>max)
					max = sum;
			}
		}
		return max;
		
	}
	
	public static int kadane(int[] arr) {
		int maxsum = arr[0];
		int currentsum = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(currentsum>=0)
				currentsum += arr[i];
			else
				currentsum = arr[i];
			
			if(currentsum>maxsum)
				maxsum = currentsum;
		}
		return maxsum;
	}

}
