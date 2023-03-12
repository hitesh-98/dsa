package BitManipulation;

public class UniqueNo2 {

	public static void main(String[] args) {
		int[] arr = {36,50,24,56,36,24,42,50};
		
		int xor = 0;
		for(int val : arr)
			xor = xor^val;
		
		int mask = xor&(-xor);
		
		int n1 = 0;
		int n2 = 0;
		
		for(int val : arr) {
			if((xor&val)==0) {
				n1 = n1^val;
			}
			else {
				n2 = n2^val;
			}
		}
		
		System.out.println(n1+"  "+n2);

	}

}
