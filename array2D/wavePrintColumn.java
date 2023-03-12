package array2D;
import java.util.Scanner;

public class wavePrintColumn {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[r][c];
		takeInput(arr);
		columnWave(arr);

	}
	
	public static void takeInput(int[][] arr) {
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[0].length; c++)
				arr[r][c] = scn.nextInt();
		}
	}
	
	public static void columnWave(int[][] arr) {
		
		for(int c=0; c<arr[0].length; c++)
		{
			if(c%2==0)
			{
				for(int r=0; r<arr.length; r++)
					System.out.print(arr[r][c]+", ");
			}
			else
			{
				for(int r=arr.length-1; r>=0; r--)
					System.out.print(arr[r][c]+", ");
			}
		}
		System.out.print("END");
	}

}
