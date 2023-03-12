package nagarro;

import java.util.Scanner;

public class countDivision {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
			arr[i] = scn.nextInt();
		
		System.out.println(countDiv(arr,k));

	}
	
	public static int countDiv(int[] arr, int k) {
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			int quotient = arr[i]/k;
			count = count+quotient;
			
			if(arr[i]%k!=0)
				count++;
		}
		return count;
	}
	
	

}
