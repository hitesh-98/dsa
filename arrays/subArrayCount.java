package arrays;

public class subArrayCount {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int count = Print(arr);
		System.out.println(count);

	}
	
	public static int Print(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length;j++)
				count++;
		}
		return count;
	}

}
