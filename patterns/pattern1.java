package patterns;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 5;

		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}

	}

}
