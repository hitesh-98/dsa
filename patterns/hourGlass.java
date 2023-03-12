package patterns;
import java.util.Scanner;

public class hourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int nst = 2*n+1;
        int nsp = 0;
        int val;
        while(row<=2*n+1)
        {
            for (int csp=1; csp<=nsp; csp++)
                System.out.print("  ");
        
            if(row<=n+1)
                val = n-row+1;
            else
                val = row-n-1;
            for (int cst=1; cst<=nst; cst++)
            {
                System.out.print(val+" ");
                if(cst<=nst/2)
                    val--;
                else
                    val++;
            }

            System.out.println();
            row++;
            if(row<=n+1)
            {
                nsp++;
                nst = nst-2;
            }
            else
            {
                nsp--;
                nst = nst+2;
            }


            

        }


	}

}
