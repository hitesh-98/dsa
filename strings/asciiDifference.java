package strings;

import java.util.Scanner;

public class asciiDifference {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		newString(str);
	}
	
	public static void newString(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length()-1; i++)
		{
			int diff = str.charAt(i+1)-str.charAt(i);
			sb.append(str.charAt(i));
			sb.append(diff);
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb);
	}
	

}
