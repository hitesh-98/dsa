package basics;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int i = a > b ? a : b;

		while (i <= a * b) {
			if (i % a == 0 && i % b == 0)
				break;

			i++;
		}

		System.out.println(i);
	}

}
