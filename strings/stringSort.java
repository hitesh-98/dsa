package strings;
import java.util.Scanner;

public class stringSort {

		public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        String[] arr = new String[n];
	        for(int i=0; i<arr.length; i++)
	            arr[i] = scn.next();

	        sort(arr);
	    }
		
		public static boolean compareTo(String s1, String s2) {
			int i = 0;
			if(s1.compareTo(s2)>0)
				return true;
			else if(s1.compareTo(s2)<0)
				return false;
			
				if(s1.length()>s2.length())
				return true;
			else
				return false;
		}
		
		public static void swap() {
			
		}

	    public static void sort(String[] arr) {
	        for(int i=0; i<arr.length; i++)
	        {
	            for(int j=i+1; j<arr.length; j++)
	            {
	            	if(compareTo(arr[i],arr[j]))
	                {
	                    
	                }
	            }
	        }
	        for(int i=0; i<arr.length; i++)
	        	System.out.println(arr[i]);
	    }
	}