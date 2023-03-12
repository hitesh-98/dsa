package nagarro;
import java.util.Scanner;

public class shortestPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String result = shortest(str);
		System.out.println(result);
	}
	
	public static String shortest(String str) {
		String rev = new StringBuilder(str).reverse().toString();
		for(int i=0; i<str.length(); i++)
		{
			if(rev.substring(i).equals(str.substring(0,str.length()-i)))
				return rev.substring(0,i)+str;
		}
		return "";
	}

}
