package patterns;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nsp = n-1;
		int nnm = 1;
		
		while(row<=n)
		{
			for (int csp=1; csp<=nsp; csp++)
			{
				System.out.print(" ");
			}
			for(int cnm=1; cnm<=nnm; cnm++)
			{
				System.out.print(cnm);
			}
			System.out.println();
			nsp--;
			nnm = nnm+2;
			row++;
		}
	}

}
