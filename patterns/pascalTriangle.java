package patterns;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val;
		while(row<=n)
		{
			val = 1;
			for(int cst=1; cst<=nst; cst++)
			{
				System.out.print(val);
				val = (val*(row-cst))/cst;
				
			}
			System.out.println();
			row++;
			nst++;
			
		}

	}

}
