package arrays;
import java.util.*;

public class intersectionTwoArrays {

	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] first = new int[n];
	        int[] second = new int[n];

	        for(int i=0; i<first.length; i++)
	            first[i] = scn.nextInt();

	        for(int i=0; i<first.length; i++)
	            second[i] = scn.nextInt();

	        intersection(first,second);
	    }

	    public static void intersection(int[] first, int[] second) {
	        Arrays.sort(first);
	        Arrays.sort(second);
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        int i = 0;
	        int j = 0;
	        while(i<first.length && j<second.length)
	        {
	            if(first[i]>second[j])
	                j++;
	            else if(first[i]<second[j])
	                i++;
	            else
	            {
	                result.add(first[i]);
	                i++;
	                j++;
	            }
	        }
	        System.out.println(result);

	    }
	}
