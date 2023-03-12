package strings;

import java.util.Scanner;

public class wordReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		wordreverse(str);

	}
	
	public static void reverse(char[] arr, int start, int end) {
		
		while(start<=end)
		{
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void wordreverse(String str) {
		char[] arr = str.toCharArray();
		
		int start = 0;
		for(int end=0; end<arr.length; end++)
		{
			if(arr[end]==' ')
			{
				reverse(arr,start,end);    //reverse word if find space
				start = end+1;
			}
		}
		
		reverse(arr,start,arr.length-1);  //reverse last word
		reverse(arr,0,arr.length-1);      //reverse entire string
		
		System.out.println(arr);
		
	}

}
