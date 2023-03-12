package basics;

import java.util.Scanner;

public class printPrime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int num = 2; num <= n; num++) {
			int fact = 0;

			for (int div = 2; div * div <= num; div++) {
				if (num % div == 0)
					fact++;
			}

			if (fact == 0)
				System.out.println(num);
		}
	}

}
