package nagarro;
import java.util.*;

public class printRepeatingElements {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,4,2,6,6,5};
		print(arr);

	}
	
	public static void print(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					list.add(arr[i]);
			}
		}
		System.out.println(list);
	}

}
