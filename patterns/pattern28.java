package patterns;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nsp = n - 1;
		int nnm = 1;
		int num;

		while (row <= n) {
			num = row;
			for (int csp = 1; csp <= nsp; csp++) 
				System.out.print("\t");
			
			for (int cnm = 1; cnm <= nnm; cnm++) {
				System.out.print(num+"\t");
				
				if(cnm<=nnm/2)
					num++;
				else
					num--;

			}
			System.out.println();
			nsp--;
			nnm = nnm+2;
			row++;
		}

	}

}
