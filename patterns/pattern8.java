package patterns;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = n;

		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst==row || cst+row==n+1)
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
			System.out.println();
			row++;
		}

	}

}
