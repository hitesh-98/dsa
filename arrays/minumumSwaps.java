package arrays;
import java.util.Scanner;

public class minumumSwaps {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(arr);
		int result = minSwap(arr);
		System.out.println(result);
	}
	
	public static void takeInput(int[] arr) {
		for(int i=0; i<arr.length; i++)
			arr[i] = scn.nextInt();
	}
	
	public static int minSwap(int[] arr) {
		int result = 0;
		int index;
		for(int i=0; i<arr.length; i++)
		{
			index = i+1;
			while(arr[i]!=index)
			{
				int val = arr[i];
				swap(arr,i,val-1);
				result++;
			}
		}
	return result;
	}
	
	public static void swap(int[] arr, int i, int val) {
		int temp = arr[i];
		arr[i] = arr[val];
		arr[val] = temp;
	}

}
