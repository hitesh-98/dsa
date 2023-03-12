package patterns;

import java.util.Scanner;

public class patternRhombusNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nnm = 1;
		int nsp = n-1;
		int num;
		
		while(row <= 2*n-1)
		{
			if(row<=n)
				num=row;
			else
				num=row-2*nsp;
			
			for(int csp=1; csp<=nsp; csp++)
			{
				System.out.print(" ");
			}
			for(int cnm=1; cnm<=nnm; cnm++)
				{
				System.out.print(num);
				if(cnm<=nnm/2)
					num++;
				else
					num--;
				}
		
			System.out.println();
			row++;
			if( row <= n )
				{
				 nnm = nnm+2;
				 nsp--;
				}
			else
				{
				 nnm = nnm-2;
				 nsp++;
				}
			
		}

}

}
