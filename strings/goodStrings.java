package strings;
import java.util.Scanner;

public class goodStrings {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(goodString(str));
    }

    public static int goodString(String str) {
        int count = 0;
        int result = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
            else
            {
                result = Math.max(result,count);
                count = 0;
            }
        }
        return Math.max(result,count);

    }
}
