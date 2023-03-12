package arrays;

import java.util.Scanner;

public class calculateTheSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
            sum += (int)arr[i];
        }
        int q = scn.nextInt();
        while(q-- > 0)
        {
            int x = scn.nextInt();
            sum = 2*sum;
        }
        sum = sum%(int)(Math.pow(10,9)+7);
        System.out.println(sum);
    }

}

