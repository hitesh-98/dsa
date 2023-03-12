package arrays;
import java.util.Scanner;
public class maximumSumPathTwoArrays {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int test = scn.nextInt();
		for(int i = 0; i<test; i++)
		{
			int a = scn.nextInt();
			int b = scn.nextInt();
			int[] one = new int[a];
			takeInput(one);
			int[] two = new int[b];
			takeInput(two);
			
			int result = maxSum(one,two);
			System.out.println(result); 
		}
	}
	
	public static void takeInput(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			arr[i] = scn.nextInt();
		}
	
	public static int maxSum(int[] one, int[]two) {
		int i = 0;
		int j = 0;
		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		
		while(i<one.length && j<two.length)
		{
			if(one[i]<two[j])
				sum1 += one[i++];
			
			else if (one[i]>two[j])
				sum2 += two[j++];
			
			else //common element
			{
				result += Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				
				while(i<one.length && j<two.length && one[i]==two[j])
				{
					result += one[i];
					i++;
					j++;
				}
			}
		}
		
		while(i<one.length)
			sum1 += one[i++];
		
		while(j<two.length)
			sum2 += two[j++];
		
		result += Math.max(sum1, sum2);
		
		return result;
	}

}
