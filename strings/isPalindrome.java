package strings;
import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        String str = scn.next();
	        System.out.println(checkPalindrome(str));
	    }

	    public static boolean checkPalindrome(String str) {
	        int i = 0;
	        int j = str.length()-1;
	        while(i<=j)
	        {
	            if(str.charAt(i)!=str.charAt(j))
	                return false;

	            i++;
	            j--;
	        }
	        return true;
	    }
	}

