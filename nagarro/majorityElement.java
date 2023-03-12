package nagarro;

public class majorityElement {

	public static void main(String[] args) {
		int[] arr = {3, 3, 4, 2, 4, 4, 4, 4};
		System.out.println(majority(arr));

	}
	
	public static int majority(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>max)
				max = count;
			if(max>arr.length/2)
				return arr[i];
		}
		
		return -1;
		
	}

}
