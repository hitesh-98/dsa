package strings;
import java.util.Scanner;

public class anagram_jumbles {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String aisha = scn.next();
        String ayush = scn.next();
        if(jumbles(aisha,ayush))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean jumbles(String aisha, String ayush) {
        
        if(aisha.length()!=ayush.length())
            return false;
        int[] count = new int[26];
        for(int i=0; i<aisha.length(); i++)
        {
            count[aisha.charAt(i)-'a']++;
            count[ayush.charAt(i)-'a']--;
        }

        for(int i=0; i<count.length; i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}