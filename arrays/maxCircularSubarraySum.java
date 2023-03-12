package arrays;

public class maxCircularSubarraySum {

	public static void main(String[] args) {
		int[] arr = {4,3,-2,-9,14};
		int max = maxCircular(arr);
		System.out.println(max);

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
	
	public static int maxCircular(int[] arr) {
		int max1 = kadane(arr);
		int totalsum = 0;
		for(int i=0; i<arr.length;i++)
		{
			totalsum += arr[i];
			arr[i] = -arr[i];
		}
		int tempmax = kadane(arr);
		int max2 = totalsum+tempmax;
		int max = Math.max(max1,max2);
		
		return max;
	}

}
