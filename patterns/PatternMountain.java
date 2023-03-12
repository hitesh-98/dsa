package patterns;
import java.util.Scanner;

public class PatternMountain {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int row = 1;
	        int nst = 1;
	        int nsp = 2*n-3;
	        while(row<=n)
	        {
	            int num =1;
	            for(int cst=1; cst<=nst; cst++)
	            { 
	                System.out.print(num+"\t");
	                    num++;
	            }
	            for(int csp=1; csp<=nsp; csp++)
	                System.out.print("\t");

	            int cst=1;
	            num=row;
	            if(row==n)
	                {
	                    cst=2;
	                    num=row-1;
	                }
	            for(; cst<=nst; cst++)
	            {    
	                System.out.print(num+"\t");
	                num--;
	            }
	            System.out.println();
	            row++;
	            nst++;
	            nsp = nsp-2;

	        }

	}

}
