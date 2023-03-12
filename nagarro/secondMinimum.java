package nagarro;

public class secondMinimum {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1};
		System.out.println(secondMin(arr));

	}
	
	public static int secondMin(int[] arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<first)
			{
				second = first;
				first = arr[i];
			}
			
			else if(arr[i]<second && arr[i]!=first)
				second = arr[i];
		}
		if(second == Integer.MAX_VALUE)
			return 0;
		else
			return second;
	}

}
