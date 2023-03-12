package basics;
import java.util.Scanner;

public class nobita {

	public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        for(int i=0; i<test; i++)
        {
            int x = scn.nextInt();
            int n = scn.nextInt();
            System.out.println(nobita(x,n));
        }
    }

    public static int nobita(int x, int n) {

        if(x<n){              //if candies are less then friends
            int min = n-x;
            return Math.min(min,x);
        }
        
        else if(x%n==0)       
            return 0;
        
        else{
            int rem = x%n;    //if candies are more than friends
            if(rem>n/2)       //if remaining candies are more than friends/2 then
                rem = n-rem;  //calculate minimum i.e take more or return
            return rem;
        }
    }
}
