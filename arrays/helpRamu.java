package arrays;
import java.util.Scanner;
public class helpRamu {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test>0)
		{
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();
			int m = scn.nextInt();
			int n = scn.nextInt();
			int[] rickshaw = new int[1005];
			int[] cab = new int[1005];
			
			for(int i=0; i<m; i++)
				rickshaw[i] = scn.nextInt();
			
			for(int i=0; i<n; i++)
				cab[i] = scn.nextInt();
			
			int rickcost = 0;
			for(int i=0; i<m; i++)
				rickcost += Math.min(c1*rickshaw[i], c2);
			rickcost = Math.min(c3, rickcost);
			
			int cabcost = 0;
			for(int i=0; i<n; i++)
				cabcost += Math.min(c1*cab[i], c2);
			cabcost = Math.min(c3, cabcost);
			
			int finalcost = Math.min(c4, cabcost+rickcost);
			
			System.out.println(finalcost);
			
			test--;
		}
		
		

	}

}
