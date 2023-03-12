package basics;
import java.util.Scanner;
public class countnumFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int digit = scn.nextInt();

		int count = 0;

		while (number != 0) {
			int rem = number % 10;
			if (rem == digit)
				count++;

			number = number / 10;
		}
		
		System.out.println(count);

	}

}
