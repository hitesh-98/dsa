package patterns;

import java.util.Scanner;

public class manmohan2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while(row<=n)
		{
			if(row==1)
				System.out.print("1");
			
			else
			{	
				for(int cst=1; cst<=nst; cst++)
				{
					if(cst==1||cst==nst)
						System.out.print(row-1);
					else 
						System.out.print("0");
				}
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
