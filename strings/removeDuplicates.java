package strings;

import java.util.Scanner;

public class removeDuplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		remove(str);
	}
	
	public static void remove(String str) {
		boolean[] duplicate = new boolean[256];
		String result = "";
		for(int i=0; i<str.length(); i++)
		{
			if(duplicate[str.charAt(i)]==false)
			{
				duplicate[str.charAt(i)] = true;
				result += str.charAt(i);
			}
		}
		System.out.println(result);
		
	}

}
