package basics;
import java.util.Scanner;
public class PrimeVisit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		
		
		while(N!=0)
		{   
			int a = scn.nextInt();
			int b = scn.nextInt();
			int total = 0;
			
			
			for(int i=a; i<=b; i=i+2)
			{
				int fact=0;
				for(int div=2;div*div<=i;div++)
				{
					if(i%div==0)
					{
						fact++;
					}
				}
				if(fact==0)
					total++;
			}
			System.out.println(total);
			N--;
		}
	}

}
