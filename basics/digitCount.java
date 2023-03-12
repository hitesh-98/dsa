package basics;

import java.util.Scanner;

public class digitCount {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 0;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		System.out.println("digit count is " +count);
			

	}

}
