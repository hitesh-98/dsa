package patterns;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int num = 0;

		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(num + "\t");

				if (cst <= nst / 2)
					num--;
				else
					num++;
			}
			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;

		}

	}

}
