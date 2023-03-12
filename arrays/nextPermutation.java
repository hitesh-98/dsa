package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nextPermutation {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int test = scn.nextInt();
		for(int i = 0; i<test; i++)
		{
			int[] arr = takeInput();
			nextNumber(arr);
			System.out.println();
		}
		
	}
	
	public static int[] takeInput() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        return arr;
    }
	
	public static void nextNumber(int []arr) {
		
		int index = -1;
		int i;
		for ( i = arr.length-1; i>0; i--)
		{
			if(arr[i]>arr[i-1])
			{
				index = i;
				break;
			}
		}
		
		if(index == -1)
		{
			Arrays.sort(arr, 0,arr.length);
			for( i = 0; i<arr.length; i++)
				System.out.print(arr[i]+" ");
		}
			
		else
		{
			int previous = index;
			for( i = index+1; i<arr.length; i++)
			{
				if(arr[i]>arr[index-1] && arr[i]<=arr[previous])
					previous = i;
			}
			
			swap(arr, index-1, previous);
			Arrays.sort(arr,index,arr.length);
			
			for( i = 0; i<arr.length; i++)
				System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
