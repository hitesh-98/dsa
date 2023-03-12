package nagarro;

import java.util.Scanner;

public class splitEvenWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<arr.length; i++)
			arr[i] = scn.next();
		splitStr(arr);
	}
	
	public static void splitStr(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].length()%2==0 && arr[i].length()!=2)
			{
				
				sb.append(arr[i].substring(0, arr[i].length()/2));
				sb.append(" ");
				sb.append(arr[i].substring(arr[i].length()/2, arr[i].length()));
				sb.append(" ");
			}
			else
				sb.append(arr[i]+" ");
		}
		
		System.out.println(sb);
	}

}
