package arrays;
import java.util.*;

public class unionAndIntersection {

	public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] first = new int[n];
        for(int i=0; i<first.length; i++)
            first[i] = scn.nextInt();
        
        int m = scn.nextInt();
        int[] second = new int[m];
        for(int i=0; i<second.length; i++)
            second[i] = scn.nextInt();

        union_intersection(first, second);
    }

    public static void union_intersection(int[] first, int[] second) {
        ArrayList<Integer> union = new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int i=0; 
        int j=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]>second[j])
            {
                if(!union.contains(second[j]))
                    union.add(second[j]);
                j++;
            }
            else if(first[i]<second[j])
            {
                if(!union.contains(first[i]))
                    union.add(first[i]);
                i++;
            }
            else
            {
            	if(!union.contains(first[i]))
            		union.add(first[i]);
            	if(!intersection.contains(first[i]))
            		intersection.add(first[i]);
                i++;
                j++;
            }
        }
        while(i<first.length)
        {
        	if(!union.contains(first[i]))
        		union.add(first[i]);
        	i++;
        }

        while(j<second.length)
        {
        	if(!union.contains(first[i]))
        		union.add(second[j]);
        	j++;
        }

        for(int k = 0; k < union.size(); k++)    
            System.out.print(union.get(k)+" "); 

        System.out.println();
        for(int k = 0; k < intersection.size(); k++)    
            System.out.print(intersection.get(k)+" "); 

    }
}