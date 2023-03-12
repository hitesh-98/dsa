package array2D;
import java.util.Scanner;

public class rotateImage {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        rotate(arr); 
    }

    public static void rotate(int[][] arr) {
        //reverse row
    	for(int row=0; row<arr.length; row++)
        {
            int start = 0;
            int end = arr[row].length-1;
            while(start<end)
            {
                int temp = arr[row][start];
                arr[row][start] = arr[row][end];
                arr[row][end] = temp;

                end--;
                start++;
            }
        }
        

        //transpose
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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
