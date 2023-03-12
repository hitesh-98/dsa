package patterns;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = n;

		while (row <= n) 
		{
			for (int cst = 1; cst <= nst; cst++) 
			{
				if (cst == 1 || cst == nst || row == 1 || row == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			row++;
		}

	}

}
