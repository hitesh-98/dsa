package nagarro;

public class pattern {

	public static void main(String[] args) {
		pattern(5);

	}
	
	public static void pattern(int n) {
		
		int row = 1;
		int nst = 1;
		int star = n;
		int extra = n;
		
		while(row<=n) {
			int val = n;
			for(int cst=1; cst<=nst; cst++) {
				System.out.print(val+" ");
				val--;
			}
			
			for(int cst=nst+1; cst<=star; cst++) {
				System.out.print(extra+" ");
			}
			System.out.println();
			row++;
			nst++;
			extra--;
		}
	}

}
