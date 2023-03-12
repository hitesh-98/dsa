package patterns;

import java.util.Scanner;

public class pattern30 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nnm = n;
		int num;

		while (row <= n) {
			num = n;
			for (int cnm = 1; cnm <= nnm; cnm++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
			row++;
		}

	}

}
