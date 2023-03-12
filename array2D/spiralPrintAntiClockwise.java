package array2D;
import java.util.Scanner;

public class spiralPrintAntiClockwise {

static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[r][c];
		takeInput(arr);
		antiClockwise(arr);
	}
	
	public static void takeInput(int[][] arr) {
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[0].length; c++)
				arr[r][c] = scn.nextInt();
		}
	}
	
	public static void antiClockwise(int[][] arr) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length-1;
		int maxCol = arr[0].length-1;
		int totalElements = arr.length*arr[0].length;
		int count = 0;
		
		while (count<totalElements)
		{
			for(int r=minRow; r<=maxRow && count<totalElements; r++)
			{
				System.out.print(arr[r][minCol]+", ");
				count++;
			}
			minCol++;
			
			for(int c=minCol; c<=maxCol && count<totalElements; c++)
			{
				System.out.print(arr[maxRow][c]+", ");
				count++;
			}
			maxRow--;
			
			for(int r=maxRow; r>=minRow && count<totalElements; r--)
			{
				System.out.print(arr[r][maxCol]+", ");
				count++;
			}
			maxCol--;
			
			for(int c=maxCol; c>=minCol && count<totalElements; c--)
			{
				System.out.print(arr[minRow][c]+", ");
				count++;
			}
			minRow++;
			
		}
        System.out.print("END");
	}
}