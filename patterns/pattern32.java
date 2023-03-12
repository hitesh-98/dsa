package patterns;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int num = 1;

		while (row <= 2 * n - 1) {
			
			for (int cst = 1; cst <= nst; cst++) {
				if(cst%2==0)
					System.out.print("*"+"\t");
				else
					System.out.print(num+"\t");
			}
			System.out.println();
			row++;
			if (row <= n) {
				nst += 2;
				num++;
			}

			else {
				nst -= 2;
				num--;
			}

		}

	}

}
