package patterns;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = n;
		int nsp = 0;

		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			int cst = 1;
			if (row == 1)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}
			System.out.println();

			nst = nst - 1;
			if (row == 1)
				nsp = nsp + 1;
			else
				nsp = nsp + 2;

			row++;

		}

	}

}
