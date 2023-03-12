package patterns;

import java.util.Scanner;

public class doubleSidedArow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int nsp2 = -1;
		int val;
		int val2;
		while(row<=n)
		{
			if(row<=n/2+1)
				val = row;
			else
				val = n-row+1;
			for (int csp=1; csp<=nsp; csp++)
				System.out.print(" ");
			
			for (int cst=1; cst<=nst;cst++)
			{
				System.out.print(val);
				val--;
			}
			
			for (int csp2=1; csp2<=nsp2; csp2++)
				System.out.print(" ");
			
			val2 = 1;
			int cst = 1;
			if(row==1||row==n)
				cst = 2;
			for (; cst<=nst; cst++)
			{
				System.out.print(val2);
				val2++;
			}
			
			System.out.println();
			row++;
			if(row<=n/2+1)
			{
				nsp = nsp-2;
				nst++;
				nsp2 = nsp2+2;
			}
			else
			{
				nsp = nsp+2;
				nst--;
				nsp2 = nsp2-2;
			}
			
			
		}
		

	}

}
