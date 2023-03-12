package strings;

import java.util.Scanner;

public class wordReverse2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		wordreverse(str);

	}
	
	public static void wordreverse(String str) {
		
		String[] str1 = str.split(" ");
		
		for(int i=str1.length-1; i>=0; i--)
			System.out.print(str1[i]+" ");
	}

}
