package arrays;
import java.util.*;

public class leaders {

	public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();
        
        leaders(arr);
    }

    public static void leaders(int[] arr) {
        int rightmax = arr[arr.length-1];
        System.out.print(rightmax+" ");
        for(int i=arr.length-2; i>=0; i--)
        {
            if(arr[i]>=rightmax)
            {
                rightmax = arr[i];
                System.out.print(rightmax+" ");
            }

        }
    }
}