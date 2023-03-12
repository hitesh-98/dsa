package arrays;
import java.util.Scanner;
public class trappingRainWater {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int test = scn.nextInt();
		for(int i=0; i<test; i++)
		{
			int n = scn.nextInt();
			int[] arr = new int[n];
			takeInput(arr);
			int result = water(arr);
			System.out.println(result);
		}
 
	}
	
	public static void takeInput(int[] arr) {
		for(int i=0; i<arr.length; i++)
			arr[i] = scn.nextInt();
	}
	
	public static int water(int[] arr) {
		int result = 0;
		int low = 0;
		int high = arr.length-1;
		int leftmax = 0;
		int rightmax = 0;
		
		while(low<=high)
		{
			if(arr[low]<arr[high])
			{
				if(arr[low]>leftmax)
					leftmax = arr[low];
				else
				{
					result += leftmax-arr[low];
					low++;
				}
			}
			else
			{
				if(arr[high]>rightmax)
					rightmax = arr[high];
				else
				{
					result += rightmax-arr[high];
					high--;
				}
			}
		}
		return result;
	}
}
