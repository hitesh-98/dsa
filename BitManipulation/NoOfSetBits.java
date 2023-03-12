package BitManipulation;

public class NoOfSetBits {

	public static void main(String[] args) {
		//setBits((byte)120);
		brianKernighans((byte)120);

	}
	
	//works only for a positive number
	//TC : O(logn base2)
	public static void setBits(byte n) {
		
		int count = 0;
		while(n!=0)
		{
			if((n&1)==1)
				count++;
			n = (byte) (n>>1);
		}
		
		System.out.println(count);
	}
	
	//
	public static void brianKernighans(byte n) {
		
		int count = 0;
		while(n!=0)
		{
			byte rmsbmask = (byte) (n&(-n));
			n = (byte) (n-rmsbmask);
			count++;
		}
		
		System.out.println(count);
	}

}
