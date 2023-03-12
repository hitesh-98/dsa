package strings;
import java.util.Scanner;

public class sumOfNoInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        for(int i=0; i<test; i++)
        {
            String str = scn.next();
            StringSum(str);
        }
    }

    public static void StringSum(String str) {
        int sum = 0;
        String number = "0";
        for(int i=0; i<str.length(); i++)
        {
            if( Character.isDigit(str.charAt(i)) )
            {
                number += str.charAt(i);
            }
            else
            {
                sum += Integer.parseInt(number);
                number = "0";
            }
        }
        sum += Integer.parseInt(number);
        System.out.println(sum);
    }
}
