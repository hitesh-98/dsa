package nagarro;
import java.util.*;

public class spiralMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(spiral(arr));

	}
	
	public static ArrayList spiral(int[][] arr) {
		int count = 0;
		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length-1;
		int maxCol = arr[0].length-1;
		int total = arr.length*arr[0].length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(count<total)
		{
			for(int i=minRow; i<=maxRow && count<total; i++)
			{
				list.add(arr[i][minCol]);
				count++;
			}
			minCol++;
			
			for(int j=minCol; j<=maxCol && count<total; j++)
			{
				list.add(arr[maxRow][j]);
				count++;
			}
			maxRow--;
			
			for(int i=maxRow; i>=minRow && count<total; i--)
			{
				list.add(arr[i][maxCol]);
				count++;
			}
			maxCol--;
			
			for(int j=maxCol; j>=minCol && count<total; j--)
			{
				list.add(arr[minRow][j]);
				count++;
			}
			minRow++;
		}
		
		return list;
	}

}
