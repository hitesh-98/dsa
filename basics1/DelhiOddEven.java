package basics1;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
		int count = 1;

		while (count <= n) {
			long evensum = 0;
			long oddsum = 0;
			long n1 = scn.nextLong();

			while (n1 != 0) {
				long rem = n1 % 10;
				if (rem % 2 == 0)
					evensum = evensum + rem;
				else
					oddsum = oddsum + rem;

				n1 = n1 / 10;
			}

			if (evensum % 4 == 0 || oddsum % 3 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

			count++;
		}

	}

}
