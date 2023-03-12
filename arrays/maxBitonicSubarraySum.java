package arrays;

import java.util.Scanner;

public class maxBitonicSubarraySum {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(arr);
		int result = bitonicSum(arr);
		System.out.println(result);

	}
	
	public static void takeInput(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			arr[i] = scn.nextInt();
	}
	
	public static int bitonicSum(int[] arr) {
		int result = 1;
		int[] inc = new int[arr.length];
		int[] dec = new int[arr.length];
		
		inc[0] = 1;
		for(int i=1; i<arr.length; i++) // increasing array
		{
			if(arr[i]>arr[i-1])
				inc[i] = inc[i-1]+1;
			else
				inc[i] = 1;
		}
		
		dec[arr.length-1] = 1;
		for(int i=arr.length-2; i>=0; i--) // decreasing array
		{
			if(arr[i]>arr[i+1])
				dec[i] = dec[i+1]+1;
			else
				dec[i] = 1;
		}
		
		for(int i=0; i<arr.length; i++) // max value
		{
			if(inc[i]+dec[i]-1>result)
				result = inc[i]+dec[i]-1;
		}
		
		return result;
		
	}

}
