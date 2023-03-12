package patterns;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = n;
		int nsp = 0;

		while (row <= n) {
			for (int csp=1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			System.out.println();
			row++;
			nst--;
			nsp = nsp+2;
		}
	}

}
