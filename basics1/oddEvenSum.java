package basics1;

import java.util.Scanner;

public class oddEvenSum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long oddsum = 0;
		long evensum = 0;
		long rem;
		long count = 1;
		
		while(n!=0)
		{
			rem = n%10;
			if(count%2==0)
				evensum = evensum+rem;
			else
				oddsum = oddsum+rem;
			
			n = n/10;
			count++;
			
		}
		System.out.println(oddsum);
		System.out.println(evensum);
		

	}

}
