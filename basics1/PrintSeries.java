package basics1;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int print = n1;
		int n = 1;

		while (print > 0) {

			if ((3 * n + 2) % n2 != 0) {
				System.out.println(3 * n + 2);
				print--;
			}

			n++;

		}

	}

}
