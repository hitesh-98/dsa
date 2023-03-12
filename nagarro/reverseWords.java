package nagarro;

public class reverseWords {

	public static void main(String[] args) {
		String result = wordReverse("my name is hitesh goyal");
		System.out.println(result);

	}
	
	public static String wordReverse(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1; i>=0; i--)
			sb.append(arr[i]+" ");
		
		return sb.toString();
		
	}

}
