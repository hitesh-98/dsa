package nagarro;

public class rotateImage {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(arr);

	}
	
	public static void rotate(int[][] arr) {
		
		for(int i=0; i<arr.length; i++)       //transpose
		{
			for(int j=i; j<arr[0].length; j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int row=0; row<arr.length; row++)      //reverse
		{
			int start = 0;
			int end = arr.length-1;
			while(start<end)
			{
				int temp  = arr[row][start];
				arr[row][start] = arr[row][end];
				arr[row][end] = temp;
				
				end--;
				start++;
				
			}
		}
		
		 //display
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
