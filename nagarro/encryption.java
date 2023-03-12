package nagarro;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		display(str);

	}
	
	public static void display(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='b'||ch=='c')
			{
				ch = (char) ((int)ch+26);
			}
			ch = (char) ((int)ch-3);
			sb.append(ch);
		}
		
		System.out.println(sb);
	}

}
