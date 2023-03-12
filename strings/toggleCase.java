package strings;

import java.util.Scanner;

public class toggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		toggle(str);

	}
	
	public static void toggle(String str) {
	
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i] = (char) ( (int)ch[i]+32 );
			
			else if(ch[i]>='a'&&ch[i]<='z')
				ch[i] = (char) ( (int)ch[i]-32 );
		}
		
		String s = String.valueOf(ch);
		System.out.println(s);
	}

}
