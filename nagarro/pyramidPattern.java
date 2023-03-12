package nagarro;

public class pyramidPattern {

	public static void main(String[] args) {
		//pyramid(5);
		int[] arr = {2,5,9,3,6};
		barGraph(arr);

	}
	
	public static void pyramid(int n) {
		int nst = 1;
		int nsp = n-1;
		int row = 1;
		int val;
		
		while(row<=n)
		{
			val = row;
			for(int csp=1; csp<=nsp; csp++)
				System.out.print("  ");
			
			for(int cst=1; cst<=nst; cst++) {
				System.out.print(val+"  ");
				if(cst<=nst/2)
					val++;
				else
					val--;
			}
			
			System.out.println();
			row++;
			nst = nst+2;
			nsp--;
		}
	}
	
	public static void barGraph(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		for(int row=0; row<max; row++)
		{
			for(int col=0; col<arr.length; col++)
			{
				if(row<max-arr[col])
					System.out.print("  ");
				else
					System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
