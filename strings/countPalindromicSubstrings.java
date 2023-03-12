package strings;
import java.util.Scanner;
public class countPalindromicSubstrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int count = countPalindromicSubString(str);
		System.out.println(count);
	}
	
	public static int countPalindromicSubString(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<=str.length(); j++)
			{
				String substr = str.substring(i, j);
				
				if(checkPalindrome(substr))
					count++;
			}
		}
		return count;
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
