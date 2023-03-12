package array2D;

public class alternate_0_1_Print {

	public static void main(String[] args) {
		int[][] arr = new int[8][7];
		print_0_1(arr);

	}
	
	public static void print_0_1(int[][] arr) {
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		int totalElements = arr.length*arr[0].length;
		int count = 0;
		int val = 1;
		
		while(count < totalElements) {
			
			for(int r=minRow; r<=maxRow && count<totalElements; r++)
			{
				arr[r][minCol] = val;
				count++;
			}
			minCol++;
			
			for(int c=minCol; c<=maxCol && count<totalElements; c++)
			{
				arr[maxRow][c] = val;
				count++;
			}
			maxRow--;
			
			for(int r=maxRow; r>=minRow && count<totalElements; r--)
			{
				arr[r][maxCol] = val;
				count++;
			}
			maxCol--;
			
			for(int c=maxCol; c>=minCol && count<totalElements; c--)
			{
				arr[minRow][c] = val;
				count++;
			}
			minRow++;
			
			if(val==1)
				val=0;
			else
				val=1;
		}
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[0].length; c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
