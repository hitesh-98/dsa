package strings;

import java.util.Scanner;

public class longestCommonPrefix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<n; i++)
			arr[i] = scn.next();
		
		String sb = Prefix(arr);
		System.out.println(sb);
	}
	
	public static int minLength(String[] arr) {
		int min = arr[0].length();
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i].length()<min)
				min = arr[i].length();
		}
		return min;
	}
	
	public static String Prefix(String[] arr) {
		if(arr.length==0)
		{
			StringBuilder empty = new StringBuilder("");
			return empty.toString();
		}
		
		int min = minLength(arr);
		StringBuilder result = new StringBuilder("");
		char current;
		for(int i=0; i<min; i++)
		{
			current = arr[0].charAt(i);
			
			for(int j=1; j<min; j++)
			{
				if(arr[j].charAt(i)!=current)
					return result.toString();
			}
			result = result.append(current);
		}
		return result.toString();
	}

}
