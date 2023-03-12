package nagarro;

import java.util.Scanner;

public class buildingSunlight {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] height  = new int[n];
		for(int i=0; i<height.length; i++)
			height[i] = scn.nextInt();
		
		System.out.println(countBuilding(height));
	}
	
	public static int countBuilding(int[] height) {
		int count = 1;
		int max = height[0];
		for(int i=1; i<height.length; i++)
		{
			if(height[i]>=max)
			{
				count++;
				max = height[i];
			}
		}
		return count;
	}

}
