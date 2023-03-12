package strings;

import java.util.Scanner;

public class consecutiveCharacters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		maxPower(str);

	}
	
	public static void maxPower(String str) {
		int count = 0;
		int maxcount = 0;
		char prev = ' ';
		for(int i=0; i<str.length(); i++)
		{
			char curr = str.charAt(i);
			if(curr==prev)
				count++;
			else 
			{
				count = 1;
				prev = curr;
			}
			
			maxcount = Math.max(maxcount, count);
		}
		System.out.println(maxcount);
	}

}
