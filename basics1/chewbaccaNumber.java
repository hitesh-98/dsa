package basics1;

import java.util.Scanner;

public class chewbaccaNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long ans = 0;
		long mult = 1;

		while (n >= 10) {

			long rem = n % 10;
			if (rem >= 5)
				rem = 9 - rem;

			ans = rem * mult + ans;
			mult = mult * 10;
			n = n / 10;

		}
		if (n == 9)
			ans = n * mult + ans;
		else if (n >= 5 && n < 9) 
		{
			n = 9 - n;
			ans = n * mult + ans;
		} 
		else
			ans = n * mult + ans;

		System.out.println(ans);

	}

}
