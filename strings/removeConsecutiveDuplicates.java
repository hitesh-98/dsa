package strings;

import java.util.Scanner;

public class removeConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		remove(str);
	}
	
	public static void remove(String str) {
		StringBuilder result = new StringBuilder(str.charAt(0)+"");
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i)!=str.charAt(i-1))
			{
				result.append(str.charAt(i));
			}
		}
		System.out.println(result);
		
	}

}
