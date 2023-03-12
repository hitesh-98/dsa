package arrays;

public class subArraySum {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		subarraySum(arr);
		

	}
	
	public static void subarraySum(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=i; j<arr.length; j++)
			{
				sum = sum+arr[j];
				System.out.println(sum);
			}
		}
	}

}
