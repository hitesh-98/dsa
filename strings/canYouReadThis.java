package strings;

import java.util.Scanner;

public class canYouReadThis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		read(str);
	}
	
	public static void read(String str) {
		int start = 0;
		int i;
		for(i=0; i<str.length(); i++)
		{
			if(i!=0 && str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				System.out.println(str.substring(start,i));
				start = i;
			}
			
		}
		
		System.out.print(str.substring(start,i));
	}

}
