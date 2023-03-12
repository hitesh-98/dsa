package basics;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int fact = 0;

		for (int div = 2; div * div <= n; div++) {
			if (n % div == 0) {
				fact++;
				break;
			}
		}

		if (fact == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
