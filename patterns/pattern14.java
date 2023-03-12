package patterns;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
		while(row <= 2*n-1)
		{
			for(int csp=1; csp<=nsp; csp++)
				System.out.print("  ");
			for(int cst=1; cst<=nst; cst++)
				System.out.print("* ");
			
			System.out.println();
			row++;
			if(row <= n)
				{
				 nst++;
				 nsp--;
				}
			else
				{
				 nst--;
				 nsp++;
				}
		}
}
}
