package basics;
import java.util.Scanner;

public class nthFibonacci {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int count = 0;
		
		
		while(count<n)
		{
			
			int sum = a+b;
			a = b;
			b = sum;
			count++;
		}
		
		if (count==n)
			System.out.println(a);
		
		
	}

}
