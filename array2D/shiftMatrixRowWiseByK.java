package array2D;

import java.util.Scanner;

public class shiftMatrixRowWiseByK {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				arr[i][j] = scn.nextInt();
		}
		int k = scn.nextInt();
		shift(arr,k);
	}
	
	public static void shift(int[][] arr, int k) {
		
		k = k % arr.length;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=k; j<arr[0].length; j++)       //start from kth row
				System.out.print(arr[i][j]+" ");
			
			for(int j=0; j<k; j++)
				System.out.print(arr[i][j]+" ");         //print row before k
			
			System.out.println();
		}
	}

}
