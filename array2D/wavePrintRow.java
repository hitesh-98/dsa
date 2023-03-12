package array2D;
import java.util.Scanner;

public class wavePrintRow {

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
		
		for(int r=0; r<arr.length; r++)
		{
			if(r%2==0)
			{
				for(int c=0; c<arr[0].length; c++)
					System.out.print(arr[r][c]+", ");
			}
			else
			{
				for(int c=arr[0].length-1; c>=0; c--)
					System.out.print(arr[r][c]+", ");
			}
		}
		System.out.print("END");
	}

}
