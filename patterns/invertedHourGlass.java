package patterns;

import java.util.Scanner;

public class invertedHourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2*n-1;
		int val;
		while(row<=2*n+1)
		{
			val = n;
			int cst=1;
			if(row==n+1)
				cst = 2;
			for (; cst<=nst; cst++)
				{
					System.out.print(val+" ");
					if(cst == nst) 
					{
						if(row == n+1) 
							val--;
					}
					else 
					val--;
				}
				
			
			for (int csp=1; csp<=nsp; csp++)
				System.out.print("  ");
			
			for(cst = 1; cst<=nst; cst++)
				{
				System.out.print(val+" ");
				val++;
				}
			
			System.out.println();
			row++;
			if(row<=n+1)
			{
				nst++;
				nsp = nsp-2;
			}
			else
			{
				nst--;
				nsp = nsp+2;
			}
		}

	}

}

