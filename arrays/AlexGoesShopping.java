package arrays;
import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] price = new int[n];
        for(int i=0; i<n; i++)
            price[i] = scn.nextInt();

        int query = scn.nextInt();
        for(int i=0; i<query; i++)
        {
            int a = scn.nextInt();
            int k = scn.nextInt();
            canAlexShop(price,a,k);
        }
    }

    public static void canAlexShop(int[] price, int a, int k) {
        int capacity = 0;
        for(int i=0; i<price.length; i++)
        {
            if(a%price[i]==0)
                capacity++;
        }
        if(capacity>=k)
            System.out.println("Yes");
        else
             System.out.println("No");
    }
}
