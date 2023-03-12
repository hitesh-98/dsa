package patterns;

import java.util.Scanner;

public class pattern13 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		
		while(row <= 2*n-1)
		{
			for(int cst=1; cst<=nst; cst++)
			{
				System.out.print("* ");
			}
			System.out.println();
			row++;
			if(row <= n)
				nst++;
			else
				nst--;
		}

	}

}
