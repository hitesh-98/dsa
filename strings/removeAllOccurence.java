package strings;

import java.util.Scanner;

public class removeAllOccurence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = scn.next().charAt(0);
		remove(str,ch);
	}
	
	public static void remove(String str, char ch) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=ch)
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
		
	
	}

}
