package nagarro;

public class Electrostatic {

	public static void main(String[] args) {
		int[] arr = {2,5,3,7,8,1,0};
		String str = "PPNPNPN";
		sum(arr,str);
	}
	
	public static void sum(int[] arr, String str) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			char ch = str.charAt(i);
			if(ch=='P') {
				sum += arr[i];
			}else {
				sum -= arr[i];
			}
		}
		System.out.println(sum);
	}

}
