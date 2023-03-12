package recursion;
import java.util.Scanner;

public class generateBinaryStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        for(int i=0; i<test; i++)
        {
            String str = scn.next();
            BinaryStrings(str,"");
            System.out.println();
        }
    }

    public static void BinaryStrings(String ques, String ans) {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        if(ch=='?')
        {
            BinaryStrings(roq,ans+"0");
            BinaryStrings(roq,ans+"1");
        }
        else
        {
            BinaryStrings(roq,ans+ch);
        }
    }
}