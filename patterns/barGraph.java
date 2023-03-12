package patterns;
import java.util.Scanner;

public class barGraph {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		bargraph(arr);

	}
	
	public static int[] takeInput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scn.nextInt();
		
		return arr;
	}
	
	public static void bargraph(int[] arr) {
		int max = arrayMax(arr);
		
		for(int rows=0; rows<max; rows++)
		{
			for(int cols=0; cols<arr.length; cols++)
			{
				if(rows<max-arr[cols])
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	

}
