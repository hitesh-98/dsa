package arrays;
import java.util.Scanner;

public class minNumberFromGivenSequence {

	 public static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	        int n = scn.nextInt();
	        String[] str = new String[n];
	        for(int i=0; i<str.length; i++)
	        {
	            str[i] = scn.next();
	            minNumber(str[i]);
	        }
	    }

	    public static void minNumber(String str) {
	        int val = 1;
	        int[] result = new int[str.length()+1]; 
	        for(int i=0; i<=str.length(); i++)
	        {
	            if(i==str.length()||str.charAt(i)=='I')
	            {
	                result[i] = val;
	                val++;
	                for(int j=i-1; j>=0&&str.charAt(j)=='D'; j--)
	                {
	                    result[j] = val;
	                    val++;
	                }
	            }
	        }
	        for(int var : result)
	            System.out.print(var);
	        System.out.println();

	    }
	}
