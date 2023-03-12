package strings;
import java.util.*;

public class oddEvenCharacter {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        replace(str);

    }

    public static void replace(String str) {
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if((i+1)%2==0)
                ch[i] = (char) ((int) ch[i]-1);
            else
                 ch[i] = (char) ((int) ch[i]+1);
        }
        String s = String.valueOf(ch);
        System.out.println(s);
    }
}
