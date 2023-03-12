package basics1;

import java.util.Scanner;

public class simpleInput {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;

		while (true) {
			int n = scn.nextInt();
			sum = sum + n;

			if (sum > 0)
				System.out.println(n);
			else
				break;

			

		}

	}

}
