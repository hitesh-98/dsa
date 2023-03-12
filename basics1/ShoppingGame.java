package basics1;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		for (int i=1;i<=N;i++) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			int count;
			int asum = 0;
			int hsum = 0;

			for (count = 1; asum <= m; count += 2)
				asum = asum + count;

			for (count = 2; hsum <= n; count += 2)
				hsum = hsum + count;

			if (asum > hsum) 
				System.out.println("Aayush");

			else 
				System.out.println("Harshit");

		}

	}
}
