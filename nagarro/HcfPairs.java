package nagarro;

public class HcfPairs {

	public static void main(String[] args) {
		noPairs(10);
		//System.out.println(coPrime(2,6));

	}
	
	public static void noPairs(int n) {
		
		for(int i=2; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(coPrime(i,j)) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

	
	public static boolean coPrime(int a, int b) {
		
		int min = a<b?a:b;
		for(int i=2; i<=min; i++) {
			
			if(a%i==0&&b%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
